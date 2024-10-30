
import java.io.File;

public class RenombrarDirectorios {

    public void renombrarDirectorios(String path, String nuevoNombre) {
        // Validar que el path es un directorio
        File directorio = new File(path);
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La ruta especificada no es un directorio válido.");
            return;
        }

        // Llamada para cambiar el nombre de los directorios dentro del path dado
        renombrarDirectoriosInternos(directorio, nuevoNombre);
    }

    private void renombrarDirectoriosInternos(File directorio, String nuevoNombreUsr) {
        // Obtener el listado de archivos y directorios internos
        File[] archivosInternos = directorio.listFiles();
        if (archivosInternos == null)
            return;

        for (File archivo : archivosInternos) {
            if (archivo.isDirectory()) {
                // Obtener el nombre del directorio actual
                String nombreOriginal = archivo.getName();
                String nuevoNombre = nuevoNombreUsr + nombreOriginal;

                // Crear el nuevo directorio con el nombre modificado
                File nuevoDirectorio = new File(archivo.getParent(), nuevoNombre);

                // Renombrar el directorio actual
                if (archivo.renameTo(nuevoDirectorio)) {
                    System.out.println("Directorio renombrado: " + nombreOriginal + " -> " + nuevoNombre);

                    // Llamada recursiva para renombrar los directorios dentro de este nuevo
                    // directorio
                    renombrarDirectoriosInternos(nuevoDirectorio, nuevoNombreUsr);
                } else {
                    System.out.println("Error al renombrar el directorio: " + nombreOriginal);
                }
            }
        }
    }
}

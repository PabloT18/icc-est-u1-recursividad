public class App {
    public static void main(String[] args) throws Exception {
        Recursividad recursividad = new Recursividad();

        System.out.println("Suma de consecutivos de 5: " + recursividad.sumaConsecutivos(5));
        System.out.println("Potencia de 7: " + recursividad.potencia(7, 2));
        System.out.println("Suma de digitos del 456: " + recursividad.sumaDigitos(456));

        // Ruta donde se creará la estructura de directorios
        String pathBase = "src/directorios";
        GeneratorDirecorios generador = new GeneratorDirecorios();
        generador.crearEstructuraDirectorios(pathBase);

        // Ruta donde se renombrarán los directorios
        // String path = "src/directorios";
        // RenombrarDirectorios renombrarDirectorios = new RenombrarDirectorios();
        // renombrarDirectorios.renombrarDirectorios(path, "dsfs");

    }
}

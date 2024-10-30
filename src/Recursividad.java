/**
 * Recursividad
 */
/**
 * The Recursividad class provides methods for performing various recursive
 * operations.
 */
public class Recursividad {

    /**
     * Calculates the sum of all consecutive integers from 1 to n.
     * Suma de números enteros consecutivos
     * Función recursiva: La función calcula la suma de todos los números enteros
     * consecutivos desde 1 hasta un número dado n.
     * 
     * Caso base: Si n es igual a 1, se devuelve 1, ya que la suma de los primeros 1
     * números es 1.
     * Caso recursivo: Si n es mayor que 1, se suma n a la suma de los números
     * enteros consecutivos desde 1 hasta n-1.
     * 
     * @param n the upper limit of the sum.
     * @return the sum of all consecutive integers from 1 to n.
     */
    public int sumaConsecutivos(int n) {
        // Caso base: si n es 1, la suma es 1
        if (n == 1) {
            return 1;
        }
        // Caso recursivo: sumar n a la suma de los números de 1 a n-1
        return n + sumaConsecutivos(n - 1);
    }

    /**
     * Calculates the result of raising a base to a given exponent.
     *
     * Potencia de un número
     * Función recursiva: Calcula la potencia de un número base elevado a un
     * exponente.
     * 
     * Caso base: Si el exponente es 0, cualquier número elevado a 0 es 1.
     * Caso recursivo: Si el exponente es mayor que 0, se multiplica la base por el
     * resultado de la potencia de la base elevada al exponente - 1.
     * 
     * @param base      the base number.
     * @param exponente the exponent to raise the base to.
     * @return the result of base raised to the power of exponente.
     */
    public int potencia(int base, int exponente) {
        // Caso base: cualquier número elevado a la potencia de 0 es 1
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: multiplicar la base por la potencia de base^(exponente-1)
        return base * potencia(base, exponente - 1);
    }

    /**
     * Calculates the sum of the digits of a given number.
     *
     * Suma de dígitos de un número
     * Función recursiva: Calcula la suma de los dígitos de un número.
     * 
     * Caso base: Si el número es menor que 10, significa que tiene un solo dígito,
     * por lo que se devuelve el número mismo.
     * Caso recursivo: Se extrae el último dígito usando el operador %, y se divide
     * el número entre 10 para eliminar el último dígito. Luego, se suma el dígito
     * extraído a la suma recursiva de los dígitos restantes.
     * 
     * @param numero the number whose digits are to be summed.
     * @return the sum of the digits of the given number.
     */
    public int sumaDigitos(int numero) {
        // Caso base: si el número es menor que 10, es un solo dígito
        if (numero < 10) {
            return numero;
        }
        // Caso recursivo: sumar el último dígito a la suma de los dígitos restantes
        return (numero % 10) + sumaDigitos(numero / 10);
    }
}

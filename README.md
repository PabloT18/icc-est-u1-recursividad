
# Recursividad y Ejercicios Recursivos en Java

## 1. **Recursividad**
La **recursividad** es una técnica en programación en la que una función se llama a sí misma para resolver problemas. Esta técnica es especialmente útil para problemas que pueden descomponerse en subproblemas similares, permitiendo que la solución de cada subproblema ayude a resolver el problema completo.

### Principios de Recursividad:
1. **Caso base**: La condición que termina la recursión. Sin un caso base, la recursión sería infinita.
2. **Caso recursivo**: Define cómo se reduce el problema en cada llamada recursiva hasta alcanzar el caso base.

---

## 2. **Ejercicios Recursivos**

### Suma de números consecutivos
Calcula la suma de todos los números enteros consecutivos desde 1 hasta un número dado `n`.
- **Caso base**: Si `n` es igual a 1, devuelve 1.
- **Caso recursivo**: Si `n` es mayor que 1, suma `n` a la suma de los números desde 1 hasta `n-1`.

**Código:**
```java
public int sumaConsecutivos(int n) {
    if (n == 1) {
        return 1;
    }
    return n + sumaConsecutivos(n - 1);
}
```

### Potencia de un número
Calcula la potencia de un número `base` elevado a un exponente `exponente`.
- **Caso base**: Si el exponente es 0, devuelve 1.
- **Caso recursivo**: Multiplica `base` por el resultado de `potencia(base, exponente - 1)`.

**Código:**
```java
public int potencia(int base, int exponente) {
    if (exponente == 0) {
        return 1;
    }
    return base * potencia(base, exponente - 1);
}
```

### Suma de dígitos de un número
Suma los dígitos de un número. Por ejemplo, para `456` debería devolver `4 + 5 + 6 = 15`.
- **Caso base**: Si el número es menor que 10, devuelve el número.
- **Caso recursivo**: Extrae el último dígito usando `%` y llama a `sumaDigitos` con el número sin el último dígito (`/ 10`).

**Código:**
```java
public int sumaDigitos(int numero) {
    if (numero < 10) {
        return numero;
    }
    return (numero % 10) + sumaDigitos(numero / 10);
}
```

### Fibonacci
Calcula el enésimo número de Fibonacci, donde `fib(0) = 0`, `fib(1) = 1` y `fib(n) = fib(n - 1) + fib(n - 2)` para `n > 1`.
- **Caso base**: Si `n` es 0 o 1, devuelve `n`.
- **Caso recursivo**: Calcula `fibonacci(n - 1) + fibonacci(n - 2)`.

**Código:**
```java
public int fibonacci(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

---

## 3. **Estructura de Directorios**

La clase `GeneratorDirecorios` se encarga de crear la siguiente estructura de directorios:

```plaintext
directorios/
├── carpeta1/
│   ├── carpeta1-1/
│   ├── carpeta1-2/
│   ├── carpeta1-3/
│   └── carpeta1-4/
└── carpeta2/
    ├── carpeta2-1/
    ├── carpeta2-2/
    ├── carpeta2-3/
    └── carpeta2-4/
```

Cada subdirectorio de último nivel contiene un archivo `.gitkeep` para que se puedan subir a un repositorio de Git.

### Código de Ejemplo en `App.java`
```java
String pathBase = "src/directorios";
GeneratorDirecorios generador = new GeneratorDirecorios();
generador.crearEstructuraDirectorios(pathBase);
```



###  **Renombrado de Directorios**

La clase `RenombrarDirectorios` permite renombrar todos los directorios dentro de una ruta dada agregando un prefijo personalizado a cada uno. 

### Ejemplo de Uso en `App.java`
```java
String path = "src/directorios";
RenombrarDirectorios renombrarDirectorios = new RenombrarDirectorios();
renombrarDirectorios.renombrarDirectorios(path, "Prefijo_");
```

Este ejemplo renombrará los directorios internos en `src/directorios` agregando el prefijo `"Prefijo_"` a cada nombre de directorio.



### **Ejemplo de Salida**

Para un directorio `src/directorios` que contiene `carpeta1` y `carpeta2`, la salida podría verse así:

```plaintext
Directorio renombrado: carpeta1 -> Prefijo_carpeta1
Directorio renombrado: carpeta1-1 -> Prefijo_carpeta1-1
...
Directorio renombrado: carpeta2 -> Prefijo_carpeta2
Directorio renombrado: carpeta2-4 -> Prefijo_carpeta2-4
```

---

## Contribute

Para contribuir a este proyecto, realiza un fork y envía un pull request, o abre un issue con tus comentarios y sugerencias.

## Autores

- [Pablo Torres] - Desarrollo inicial
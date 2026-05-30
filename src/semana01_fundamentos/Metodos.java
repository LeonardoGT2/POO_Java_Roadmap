package semana01_fundamentos;

public class Metodos {

    // Método que saluda
    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // Método que suma dos números
    static int sumar(int a, int b) {
        return a + b;
    }

    // Método que verifica si un número es par
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método que calcula el factorial
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(" METODOS ");
        saludar("Leonardo");

        System.out.println("\n SUMA ");
        System.out.println("Suma de 10 + 5 = " + sumar(10, 5));

        System.out.println("\n PAR O IMPAR ");
        System.out.println("El 8 es par: " + esPar(8));
        System.out.println("El 7 es par: " + esPar(7));

        System.out.println("\n FACTORIAL ");
        System.out.println("Factorial de 5 = " + factorial(5));
    }
}
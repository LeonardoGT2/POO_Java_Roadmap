package semana01_fundamentos;

public class TiposDeDatos {
    public static void main(String[] args) {
        
        // Tipos de datos primitivos
        int entero = 100;
        double decimal = 3.14;
        char caracter = 'A';
        boolean booleano = true;
        String texto = "Hola Java";
        
        // Mostrar valores
        System.out.println("   TIPOS DE DATOS    ");
        System.out.println("int: " + entero);
        System.out.println("double: " + decimal);
        System.out.println("char: " + caracter);
        System.out.println("boolean: " + booleano);
        System.out.println("String: " + texto);
        
        // Operadores aritméticos
        int a = 20;
        int b = 5;
        System.out.println("\n   OPERADORES    ");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }
}
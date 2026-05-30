package semana02_poo;

public class Calculadora {
    
    // Atributos
    String marca;
    
    // Constructor
    public Calculadora(String marca) {
        this.marca = marca;
    }
    
    // Métodos
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public double restar(double a, double b) {
        return a - b;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero");
            return 0;
        }
        return a / b;
    }
    
    public void mostrarResultados(double a, double b) {
        System.out.println(" CALCULADORA " + marca + " ");
        System.out.println("Numeros: " + a + " y " + b);
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicacion: " + multiplicar(a, b));
        System.out.println("Division: " + dividir(a, b));
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora("Casio");
        calc.mostrarResultados(20, 5);
        
        System.out.println();
        
        Calculadora calc2 = new Calculadora("Texas");
        calc2.mostrarResultados(100, 0);
    }
}
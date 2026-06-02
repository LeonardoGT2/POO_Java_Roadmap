package semana04_polimorfismo;

public class Figura {
    
    protected String color;
    
    // Constructor
    public Figura(String color) {
        this.color = color;
    }
    
    // Método que será sobreescrito
    public double calcularArea() {
        return 0;
    }
    
    public void mostrarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calcularArea());
    }
}
package semana04_polimorfismo;

public class Circulo extends Figura {
    
    private double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    public void mostrarInfo() {
        System.out.println("=== CIRCULO ===");
        System.out.println("Radio: " + radio);
        super.mostrarInfo();
    }
}
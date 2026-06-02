package semana04_polimorfismo;

public class Rectangulo extends Figura {
    
    private double base;
    private double altura;
    
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    public void mostrarInfo() {
        System.out.println("=== RECTANGULO ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        super.mostrarInfo();
    }
}
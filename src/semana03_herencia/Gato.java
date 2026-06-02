package semana03_herencia;

public class Gato extends Animal {
    
    // Atributo propio de Gato
    private boolean esCallejero;
    
    // Constructor
    public Gato(String nombre, String color, int edad, boolean esCallejero) {
        super(nombre, color, edad);
        this.esCallejero = esCallejero;
    }
    
    // Sobreescritura del método
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau miau!");
    }
    
    public void mostrarInfoCompleta() {
        mostrarInfo();
        System.out.println("Callejero: " + (esCallejero ? "Si" : "No"));
    }
    
    public static void main(String[] args) {
        Gato g1 = new Gato("Michi", "Blanco", 2, false);
        Gato g2 = new Gato("Peluso", "Gris", 4, true);
        
        g1.mostrarInfoCompleta();
        g1.hacerSonido();
        
        System.out.println();
        
        g2.mostrarInfoCompleta();
        g2.hacerSonido();
    }
}
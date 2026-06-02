package semana03_herencia;

public class Perro extends Animal {
    
    // Atributo propio de Perro
    private String raza;
    
    // Constructor
    public Perro(String nombre, String color, int edad, String raza) {
        super(nombre, color, edad);
        this.raza = raza;
    }
    
    // Sobreescritura del método
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }
    
    public void mostrarInfoCompleta() {
        mostrarInfo();
        System.out.println("Raza: " + raza);
    }
    
    public static void main(String[] args) {
        Perro p1 = new Perro("Rex", "Negro", 3, "Pastor Aleman");
        Perro p2 = new Perro("Toby", "Cafe", 5, "Labrador");
        
        p1.mostrarInfoCompleta();
        p1.hacerSonido();
        
        System.out.println();
        
        p2.mostrarInfoCompleta();
        p2.hacerSonido();
    }
}
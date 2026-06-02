package semana03_herencia;

public class Animal {
    
    // Atributos
    protected String nombre;
    protected String color;
    protected int edad;
    
    // Constructor
    public Animal(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    
    // Métodos
    public void mostrarInfo() {
        System.out.println("=== ANIMAL ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }
    
    public static void main(String[] args) {
        Animal a = new Animal("Animal generico", "Cafe", 3);
        a.mostrarInfo();
        System.out.println();
        a.hacerSonido();
    }
}
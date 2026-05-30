package semana02_poo;

public class Persona {
    
    // Atributos
    String nombre;
    int edad;
    String carrera;
    
    // Constructor
    public Persona(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    // Métodos
    public void mostrarInfo() {
        System.out.println(" INFORMACION DE PERSONA ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
    
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    
    // Main - programa principal
    public static void main(String[] args) {
        
        // Crear objetos
        Persona p1 = new Persona("Leonardo", 20, "Sistemas");
        Persona p2 = new Persona("Maria", 22, "Contabilidad");
        
        p1.mostrarInfo();
        System.out.println();
        p2.mostrarInfo();
        
        System.out.println();
        p1.saludar();
        p2.saludar();
    }
}
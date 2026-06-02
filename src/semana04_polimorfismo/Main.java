package semana04_polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        // Polimorfismo
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo("Rojo", 5.0);
        figuras[1] = new Rectangulo("Azul", 4.0, 6.0);
        
        for (Figura f : figuras) {
            f.mostrarInfo();
            System.out.println();
        }
    }
}
package semana01_fundamentos;

public class Ciclos {
    public static void main(String[] args) {
        
        // CICLO FOR
        System.out.println(" CICLO FOR ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero: " + i);
        }
        
        // CICLO WHILE
        System.out.println("\n CICLO WHILE ");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        // CICLO DO-WHILE
        System.out.println("\n CICLO DO-WHILE ");
        int num = 1;
        do {
            System.out.println("Valor: " + num);
            num++;
        } while (num <= 5);
        
        // TABLA DE MULTIPLICAR
        System.out.println("\n TABLA DEL 5 ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
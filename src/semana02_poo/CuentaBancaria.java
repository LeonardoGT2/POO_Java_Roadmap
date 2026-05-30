package semana02_poo;

public class CuentaBancaria {
    
    // Atributos privados (encapsulamiento)
    private String titular;
    private double saldo;
    
    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    // Getters y Setters
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Métodos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito de Q" + monto + " exitoso.");
        } else {
            System.out.println("Monto invalido.");
        }
    }
    
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("Retiro de Q" + monto + " exitoso.");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("=== CUENTA BANCARIA ===");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: Q" + saldo);
    }
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Leonardo", 500.0);
        cuenta.mostrarInfo();
        
        System.out.println();
        cuenta.depositar(200.0);
        cuenta.retirar(100.0);
        cuenta.retirar(1000.0);
        
        System.out.println();
        cuenta.mostrarInfo();
    }
}
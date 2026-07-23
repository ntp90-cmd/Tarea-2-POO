public class CuentaBancaria {
    private final String titular;
    private final  String numeroCuenta;
    private double saldo;

    
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

   
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

   
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
            return true;
        } else {
            return false;
        }
    }

    
    public double consultarSaldo() {
        return saldo;
    }

    
    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("-----------------------");
    }
}

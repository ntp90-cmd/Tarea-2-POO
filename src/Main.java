public class main {
    public static void main(String[] args) {

       
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "001", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", "002", 500);

  
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();

    
        cuenta1.depositar(300);
        cuenta2.depositar(200);

     
        if (cuenta1.retirar(400)) {
            System.out.println("Retiro exitoso en la cuenta de Juan");
        } else {
            System.out.println("No hay saldo suficiente en la cuenta de Juan");
        }

        if (cuenta2.retirar(1000)) {
            System.out.println("Retiro exitoso en la cuenta de Maria");
        } else {
            System.out.println("No hay saldo suficiente en la cuenta de Maria");
        }

        for (int i = 1; i <= 3; i++) {
            cuenta1.depositar(100);
        }

      
        System.out.println();
        System.out.println("Saldo final de Juan: " + cuenta1.consultarSaldo());
        System.out.println("Saldo final de Maria: " + cuenta2.consultarSaldo());

    }

}

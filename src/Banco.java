public class Banco {

    public String titular = "Luis";
    public double saldo = 500000.0;

    // TODO: Metodo CON parametro - recibe double monto
    // Imprime: "Deposito realizado: " + monto
    public void depositar(double monto) {
        // Escribe aqui tu codigo
        if (saldo >= monto){
            System.out.println("Deposito realizado: " + monto);
            this.saldo -= monto;
        }
        else{
            System.out.println("saldo insuficiente ");
        }
    }

    // TODO: Metodo SIN parametro - usa this.titular y this.saldo
    // Imprime: "Titular: " + this.titular + " | Saldo: " + this.saldo
    public void mostrarSaldo() {
        // Escribe aqui tu codigo
        System.out.println("titular: " + this.titular + " saldo: " + this.saldo);
    }

    






}

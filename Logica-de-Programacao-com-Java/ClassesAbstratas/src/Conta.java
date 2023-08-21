public abstract class Conta {
    private double saldo;  // Atributo privado para armazenar o saldo da conta

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para definir o saldo da conta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método abstrato para imprimir o extrato da conta (a ser implementado nas subclasses)
    public abstract void imprimeExtrato();
}

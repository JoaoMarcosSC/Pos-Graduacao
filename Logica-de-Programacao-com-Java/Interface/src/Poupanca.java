// Classe que implementa a interface Conta para representar uma conta poupança.
public class Poupanca implements Conta {

    private double saldo; // Saldo da conta poupança.

    @Override
    public void deposita(double valor) {
        this.saldo += valor; // Incrementa o valor ao saldo.
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor; // Decrementa o valor do saldo.
    }

    @Override
    public double getSaldo() {
        return this.saldo; // Retorna o saldo da conta poupança.
    }
}

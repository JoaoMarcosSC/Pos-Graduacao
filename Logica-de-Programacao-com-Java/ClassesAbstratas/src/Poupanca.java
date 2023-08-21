public class Poupanca extends Conta {

    // Sobrescrita do método imprimeExtrato da classe Conta
    @Override
    public void imprimeExtrato() {
        System.out.println("Saldo: " + getSaldo());
    }
}

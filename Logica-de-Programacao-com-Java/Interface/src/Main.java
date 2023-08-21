public class Main {
    public static void main(String[] args) {
        Conta cp = new Poupanca(); // Cria uma instância de Conta referenciando a uma instância de Poupanca.

        cp.deposita(500); // Deposita 500 na conta.
        cp.saca(250); // Saca 250 da conta.

        System.out.println(cp.getSaldo()); // Imprime o saldo atual da conta.
    }
}

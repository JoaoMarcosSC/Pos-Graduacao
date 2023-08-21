public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Poupanca e atribuindo-a a uma variável do tipo Conta
        Conta cp = new Poupanca();

        // Definindo o saldo da conta poupança
        cp.setSaldo(5000);

        // Chamando o método imprimeExtrato da conta poupança
        cp.imprimeExtrato();
    }
}

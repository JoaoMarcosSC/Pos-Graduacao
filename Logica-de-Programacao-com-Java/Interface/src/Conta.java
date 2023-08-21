// Interface Conta define os métodos que devem ser implementados por classes que representam contas bancárias.
public interface Conta {
    void deposita(double valor); // Método para realizar um depósito na conta.
    void saca(double valor); // Método para realizar um saque da conta.
    double getSaldo(); // Método para obter o saldo da conta.
}

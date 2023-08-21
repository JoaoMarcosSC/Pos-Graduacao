public class Cao {

    // Atributos da classe Cao
    String nome;
    String cor;
    double peso;
    private int idade; // Atributo "idade" é privado para melhor controle

    // Getter para obter a idade do cachorro
    public int getIdade() {
        return idade;
    }

    // Setter para definir a idade do cachorro
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para verificar se o cachorro é considerado idoso
    public Boolean VerificaIdade() {
        if (getIdade() > 10) {
            return true;
        } else {
            return false;
        }
    }

    // Construtor da classe Cao
    public Cao(String nome) {
        this.nome = nome; // Atribui o nome fornecido ao atributo "nome"
        peso = 15.5; // Define o valor 15.5 como padrão para o atributo "peso"
    }

    // Método para simular o cachorro andando
    public void Andar() {
        System.out.println("Andando");
    }

    // Método para exibir informações sobre o cachorro
    public void DadosCao() {
        System.out.println("nome: " + nome + " peso: " + peso);
    }
}

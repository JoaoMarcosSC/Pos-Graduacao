public class Cao {

    String nome;
    String cor;
    int idade;
    double peso;

    public Cao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        peso = 15.5;
    }

    public void Andar(){
        System.out.println("Andando");
    }

    public void DadosCao(){
        System.out.println("nome: " + nome + " idade: " + idade + " peso: " + peso);
    }
}

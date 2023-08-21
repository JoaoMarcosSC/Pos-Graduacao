public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Cao com nome "Django"
        Cao Django = new Cao("Django");

        // Chamada do método Andar() no objeto Django
        Django.Andar();

        // Chamada do método DadosCao() no objeto Django
        Django.DadosCao();

        // Definindo a idade do cachorro Django como 5 anos
        Django.setIdade(5);

        // Verificando se a idade do Django é considerada "idoso"
        if (Django.VerificaIdade() == true){
            System.out.println("Idoso");
        } else {
            System.out.println("Novo");
        }
    }
}

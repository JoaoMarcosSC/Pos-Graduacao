public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Cachorro e outro da classe Gato
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        // Definindo nomes para os objetos criados
        c.setNome("Django");
        g.setNome("Rodolfo");

        // Chamando o método mostrar() para exibir o nome do cachorro
        c.mostrar();

        // Chamando o método mostrar() para exibir o nome do gato
        g.mostrar();
    }
}

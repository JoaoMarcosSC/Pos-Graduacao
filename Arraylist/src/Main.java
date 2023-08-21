import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList chamado "estados" para armazenar nomes de estados.
        ArrayList<String> estados = new ArrayList<>();

        // Adicionando elementos ao ArrayList "estados".
        estados.add("Minas Gerais");
        estados.add("Rio de Janeiro");
        estados.add("Bahia");

        // Imprimindo o ArrayList "estados".
        System.out.println(estados);

        // Removendo o elemento "Bahia" do ArrayList "estados".
        estados.remove("Bahia");

        // Verificando se o ArrayList "estados" contém o elemento "Bahia".
        estados.contains("Bahia");

        // Imprimindo o ArrayList "estados" após a remoção e verificação.
        System.out.println(estados);
    }
}

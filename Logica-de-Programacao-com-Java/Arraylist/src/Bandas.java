import java.util.ArrayList;

public class Bandas {
    public static void main(String[] args) {
        // Criando um ArrayList chamado "bandas" para armazenar nomes de bandas.
        ArrayList<String> bandas = new ArrayList<String>();

        // Adicionando elementos ao ArrayList "bandas".
        bandas.add("Kiss");
        bandas.add("Beatles");
        bandas.add("Iron Maiden");

        // Imprimindo o ArrayList "bandas".
        System.out.println(bandas);

        // Adicionando o elemento "Sepultura" na posição antes de "Kiss".
        bandas.add(bandas.indexOf("Kiss"), "Sepultura");
        System.out.println(bandas);

        // Removendo o elemento "Kiss" do ArrayList "bandas".
        bandas.remove("Kiss");
        System.out.println(bandas);

        // Limpando todos os elementos do ArrayList "bandas".
        bandas.clear();
        System.out.println(bandas);
    }
}

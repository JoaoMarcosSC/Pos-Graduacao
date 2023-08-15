import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> estados = new ArrayList<>();

        estados.add("Minas Gerais");
        estados.add("Rio de Janeiro");
        estados.add("Bahia");

        System.out.println(estados);

        estados.remove("Bahia");
        estados.contains("Bahia");

        System.out.println(estados);
    }
}
public class Main {
    public static void main(String[] args) {

// Declaração do array 'passarosPorDia' com a quantidade de pássaros observados em cada dia das duas semanas
        int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

// Declaração de variáveis para armazenar os totais de pássaros observados
        int totalPassaros = 0; // Total de pássaros em ambas as semanas
        int passarosPrimeira = 0; // Total de pássaros na primeira semana
        int passarosSegunda = 0; // Total de pássaros na segunda semana

// Loop para calcular o total de pássaros observados em ambas as semanas
        for (int i = 0; i < 14; i++) {
            totalPassaros = totalPassaros + passarosPorDia[i];
        }

// Impressão do total de pássaros observados em ambas as semanas
        System.out.println("O total de passaros é: " + totalPassaros);

// Loop para calcular o total de pássaros observados na primeira semana
        for (int i = 0; i < 7; i++) {
            passarosPrimeira = passarosPrimeira + passarosPorDia[i];
        }

// Impressão do total de pássaros observados na primeira semana
        System.out.println("O total de passaros na primeira semana é: " + passarosPrimeira);

// Loop para calcular o total de pássaros observados na segunda semana
        for (int i = 7; i < 14; i++) {
            passarosSegunda = passarosSegunda + passarosPorDia[i];
        }

// Impressão do total de pássaros observados na segunda semana
        System.out.println("O total de passaros na segunda semana é: " + passarosSegunda);
    }
}
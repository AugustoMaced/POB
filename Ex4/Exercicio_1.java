import java.util.*;

public class PessoaAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Double> alturas = new ArrayList<>();
        
        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite a altura de " + nomes.get(i) + ": ");
            alturas.add(scanner.nextDouble());
            scanner.nextLine(); // Consumir o newline
        }

        System.out.println("\nPessoas com mais de 1,70m:");
        for (int i = 0; i < 50; i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println(nomes.get(i) + " - Altura: " + alturas.get(i));
            }
        }
    }
}
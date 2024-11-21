import java.util.*;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        List<Integer> numerosCrescente = new ArrayList<>(numeros);
        List<Integer> numerosDecrescente = new ArrayList<>(numeros);

        Collections.sort(numerosCrescente);
        Collections.sort(numerosDecrescente, Collections.reverseOrder());

        System.out.println("\nNúmeros em ordem crescente: " + numerosCrescente);
        System.out.println("Números em ordem decrescente: " + numerosDecrescente);
    }
}
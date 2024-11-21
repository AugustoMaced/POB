import java.util.*;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        int maior = Collections.max(numeros);
        int count = Collections.frequency(numeros, maior);

        System.out.println("\nMaior número: " + maior);
        System.out.println("Quantidade de vezes que ele ocorre: " + count);
        System.out.print("Posições: ");
        for (int i = 0; i < 9; i++) {
            if (numeros.get(i) == maior) {
                System.out.print(i + " ");
            }
        }
    }
}
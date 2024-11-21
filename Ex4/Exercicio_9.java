import java.util.*;

public class SomaListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        // Lê 10 números para a lista A
        System.out.println("Digite 10 números para a lista A:");
        for (int i = 0; i < 10; i++) {
            A.add(scanner.nextInt());
        }

        // Lê 10 números para a lista B
        System.out.println("Digite 10 números para a lista B:");
        for (int i = 0; i < 10; i++) {
            B.add(scanner.nextInt());
        }

        // Soma os elementos de A e B, armazenando o resultado em C
        for (int i = 0; i < 10; i++) {
            C.add(A.get(i) + B.get(i));
        }

        // Exibe o conteúdo da lista C
        System.out.println("\nConteúdo da lista C (soma de A e B): ");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + C.get(i));
        }
    }
}
import java.util.*;

public class QuadradoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> quadrados = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        for (int num : numeros) {
            quadrados.add(num * num);
        }

        System.out.println("\nQuadrados dos números:");
        for (int quadrado : quadrados) {
            System.out.println(quadrado);
        }
    }
}
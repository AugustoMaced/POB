import java.util.*;

public class ContagemNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int positivos = 0, negativos = 0, nulos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numeros.add(num);
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else nulos++;
        }

        System.out.println("\nQuantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
        System.out.println("Quantidade de números nulos: " + nulos);
    }
}
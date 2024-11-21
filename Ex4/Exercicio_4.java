import java.util.*;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Double> notas = new ArrayList<>();
        double somaNotas = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite a nota de " + nomes.get(i) + ": ");
            notas.add(scanner.nextDouble());
            somaNotas += notas.get(i);
            scanner.nextLine(); // Consumir o newline
        }

        double media = somaNotas / 10;
        System.out.println("\nMédia da turma: " + media);
        System.out.println("\nAlunos com notas superiores à média:");
        for (int i = 0; i < 10; i++) {
            if (notas.get(i) > media) {
                System.out.println(nomes.get(i) + " - Nota: " + notas.get(i));
            }
        }
    }
}
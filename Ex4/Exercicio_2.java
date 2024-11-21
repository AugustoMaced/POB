import java.util.*;

public class DescontoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> matriculas = new ArrayList<>();
        List<Double> salarios = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite a matrícula do empregado " + (i + 1) + ": ");
            matriculas.add(scanner.nextInt());
            System.out.print("Digite o salário bruto de " + matriculas.get(i) + ": ");
            salarios.add(scanner.nextDouble());
        }

        System.out.println("\nDados dos empregados:");
        for (int i = 0; i < 100; i++) {
            double desconto = salarios.get(i) * 0.11;
            double salarioLiquido = salarios.get(i) - desconto;
            System.out.println("Matrícula: " + matriculas.get(i) + ", Salário Bruto: " + salarios.get(i) + ", Desconto: " + desconto + ", Salário Líquido: " + salarioLiquido);
        }
    }
}
/*O camelô Zé da banca vende diariamente, games, calculadoras e canetas. Faça um programa para solicitar o total de
games, o total de calculadoras e o total de canetas vendidas ao término do dia. O programa deve solicitar também o
preço de cada um dos produtos e ao final calcular e informar o total do faturamento com cada produto e o faturamento total. */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio4 {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o total de games vendidos: ");
        int totalGames = scanner.nextInt();
        System.out.print("Digite o preço de cada game: ");
        double precoGame = scanner.nextDouble();

        System.out.print("Digite o total de calculadoras vendidas: ");
        int totalCalculadoras = scanner.nextInt();
        System.out.print("Digite o preço de cada calculadora: ");
        double precoCalculadora = scanner.nextDouble();

        System.out.print("Digite o total de canetas vendidas: ");
        int totalCanetas = scanner.nextInt();
        System.out.print("Digite o preço de cada caneta: ");
        double precoCaneta = scanner.nextDouble();

        double faturamentoGames = totalGames * precoGame;
        double faturamentoCalculadoras = totalCalculadoras * precoCalculadora;
        double faturamentoCanetas = totalCanetas * precoCaneta;
        double faturamentoTotal = faturamentoGames + faturamentoCalculadoras + faturamentoCanetas;

        System.out.println("Faturamento com games: R$ " + df.format(faturamentoGames));
        System.out.println("Faturamento com calculadoras: R$ " + df.format(faturamentoCalculadoras));
        System.out.println("Faturamento com canetas: R$ " + df.format(faturamentoCanetas));
        System.out.println("Faturamento total: R$ " + df.format(faturamentoTotal));
    }
}
}
/*Crie um programa para ler o valor do salário mínimo, o nome e o salário bruto de um empregado.
 Se o seu salário for menor que um salário mínimo descontar 2%; se for igual,
 descontar 5%, e se for superior, descontar 8%. Informar o valor do desconto e o salário líquido. */

import java.util.Scanner;

public class Exercicio6_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor do salario minimo: R$");
        float minimo = scanner.nextFloat();
        System.out.print("Entre com o seu nome:");
        String nome = scanner.nextLine();
        System.out.print("Entre com o seu salario bruto: R$");
        float bruto = scanner.nextFloat();

        float valorDesconto;
        float liquido;

        if (bruto < minimo) {
            valorDesconto = 0.02f * bruto;
        } else if (bruto == minimo) {
            valorDesconto = 0.05f * bruto;
        } else {
            valorDesconto = 0.08f * bruto;
        }

        liquido = bruto - valorDesconto;

        System.out.println("O valor do desconto foi de: R$" + valorDesconto);
        System.out.println("O seu salario liquido eh: R$" + liquido);

        scanner.close();

    }
}
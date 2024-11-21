/*Faça um programa que leia o código, a quantidade, o preço unitário
 e a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito) de um produto. 
 Pagamentos em dinheiro recebem um desconto de 10%, em cartão de débito 5%, em cartão de crédito 3%  e em cheque 2%.
 O programa deve informar o valor do desconto e o valor final a pagar. */

import java.util.Scanner;

public class Exercicio8_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o codigo do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Entre com a quantidade: ");
        int qtd = scanner.nextInt();
        System.out.print("Entre com o preco unitario: R$");
        float unitario = scanner.nextFloat();
        System.out
                .print("Entre com a forma de pgto (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito): ");
        int forma = scanner.nextInt();

        float precoTotal = qtd * unitario;
        float desconto;

        switch (forma) {
            case 1:
                desconto = 0.10f * precoTotal;
                break;
            case 2:
                desconto = 0.02f * precoTotal;
                break;
            case 3:
                desconto = 0.05f * precoTotal;
                break;
            case 4:
                desconto = 0.03f * precoTotal;
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                scanner.close();
                return; // Encerra o programa se a forma de pagamento for inválida
        }

        float valorFinal = precoTotal - desconto;

        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Valor final a pagar: R$" + valorFinal);

        scanner.close();
    }
}
/*7.  Faça um programa que leia vários números inteiros e ao final escreva o maior.
 */

 import java.util.Scanner;


public class Exercicio7_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de numeros: ");
        int qtd = scanner.nextInt();

        int i;
        int maior = Integer.MIN_VALUE;

        for(i=0;i<qtd;i++)
        {
            System.out.print("Entre com um numero: ");
            int numeros = scanner.nextInt();

            
        if(numeros > maior) {
            maior = numeros;
        }
        }

        System.out.println("O maior numero eh: " + maior);

    }
}
/*Crie um programa que leia a altura de um número indeterminado de pessoas.
 Ao final o programa deve informar o total de pessoas cadastradas, a quantidade de pessoas com altura inferior a 1,60 metros;
  a quantidade de pessoas com altura entre 1,60 metros e 1,80 metros e a quantidade de pessoas com altura superior a 1,80 metros.
 */

import java.util.Scanner;

public class Exercicio5_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de pessoas: ");
        int qtd = scanner.nextInt();

        int i;
        int contI = 0;
        int contE = 0;
        int contS = 0;
        for (i = 0; i < qtd; i++) {
            System.out.print("Entre com sua altura em metros:");
            float alturas = scanner.nextFloat();

            if (alturas < 1.60f) {
                contI++;
            } else if ((1.60f <= alturas) && (alturas <= 1.80f)) {
                contE++;
            } else {
                contS++;
            }
        }

        System.out.println("O total de pessoas cadastradas eh: " + qtd);
        System.out.println("O total de pessoas menores de 1,60 metros eh: " + contI);
        System.out.println("O total de pessoas com altura entre 1,60 e 1,80 metros eh: " + contE);
        System.out.println("O total de pessoas com altura superior a 1,80 metros eh: " + contS);

        scanner.close();

    }
}
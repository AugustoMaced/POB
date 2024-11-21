/*8.  Crie um programa que leia o nome e a altura de 10 pessoas
 e ao final escreva: a altura média do grupo, o nome e a altura da pessoa mais alta.
 */

import java.util.Scanner;

public class Exercicio8_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int i;
        float somaAlturas = 0.0f;
        float maiorAltura = Float.MIN_VALUE;
        String nomeMaior = "";
        float altura = 0.0f;

        for (i = 0; i < 10; i++) {
            System.out.print("Entre com o seu nome: ");
            String nomes = scanner.nextLine();

            System.out.print("Entre com a sua altura em metros: ");
            float alturas = scanner.nextFloat();
            scanner.nextLine();

            somaAlturas += alturas;

            if (alturas > maiorAltura) {
                nomeMaior = nomes;
                maiorAltura = alturas;
            }
        }

        float media = somaAlturas / 10;

        System.out.println("A altura media do grupo eh: " + media);
        System.out.println("O nome da pessoa mais alta eh: " + nomeMaior);
        System.out.println("A altura da pessoa mais alta eh: " + maiorAltura);

        scanner.close();
    }
}
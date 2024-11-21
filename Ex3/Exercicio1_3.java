/*Faça um programa que leia o preço de 10 produtos.
 Ao final escreva o somatório dos preços. */

import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int somatorio = 0;
        int numeros = 0;
        for (i = 0; i < 10; i++) {
            System.out.print("Entre com um numero:");
            numeros = scanner.nextInt();
            somatorio = somatorio + numeros;

        }

        System.out.println("O somatorio eh: " + somatorio);

        scanner.close();

    }
}
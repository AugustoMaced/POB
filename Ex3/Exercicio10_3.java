/*10. Elabore um programa que leia diversos números e ao final escreva:
a quantidade de números digitados, a quantidade de números pares, a quantidade de números ímpares.
 */

import java.util.Scanner;

public class Exercicio10_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de numeros: ");
        int qtd = scanner.nextInt();

        int i;
        int contP = 0;
        int contI = 0;

        for (i = 0; i < qtd; i++) {
            System.out.print("Entre com um numero: ");
            int numeros = scanner.nextInt();

            if (numeros % 2 == 0) {
                contP++;
            } else {
                contI++;
            }
        }

        System.out.println("A quantidade de numeros digitados eh: " + qtd);
        System.out.println("A quantidade de numeros pares eh: " + contP);
        System.out.println("A quantidade de numeros impares eh: " + contI);

        scanner.close();
    }
}
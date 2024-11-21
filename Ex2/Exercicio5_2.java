/*Faça um programa que leia dois números e mostre qual o maior dos dois. O programa deve informar caso sejam iguais.  */

import java.util.Scanner;

public class Exercicio5_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Entre com outro numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.println("O primeiro numero eh menor que o segundo.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro numero eh maior que o segundo.");
        } else {
            System.out.println("Os numeros sao iguais.");
        }
        scanner.close();
    }
}
/*Elabore um programa que leia três números diferentes e informe o maior deles. */

import java.util.Scanner;

public class Exercicio7_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float maior;

        System.out.print("Entre com um numero: ");
        float num1 = scanner.nextFloat();
        System.out.print("Entre com outro numero: ");
        float num2 = scanner.nextFloat();
        System.out.print("Entre com outro numero: ");
        float num3 = scanner.nextFloat();

        if ((num1 >= num2) && (num1 >= num3)) {
            maior = num1;
        } else if ((num2 >= num1) && (num2 >= num3)) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior numero eh " + maior);

        scanner.close();
    }
}
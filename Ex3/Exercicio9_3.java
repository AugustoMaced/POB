/*A conversão de graus Farenheit para graus centígrados é obtida por : C = 5/9 * (F -32).
 Faça um programa que calcule e escreva uma tabela de centígrados
 em função de graus Farenheit, que variam de 100 a 150 de 1 em 1. */

public class Exercicio9_3 {
    public static void main(String[] args) {

        System.out.println("Tabela de conversão de Fahrenheit para Celsius:");
        System.out.println("Fahrenheit\tCelsius");

        for (int fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {
            float celsius = 5.0f / 9.0f * (fahrenheit - 32);
            System.out.printf("%d\t\t%.2f%n", fahrenheit, celsius);
        }
    }
}
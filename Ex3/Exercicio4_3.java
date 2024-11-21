/*Faça um programa que calcule e escreva no vídeo o somatório dos números inteiros de 1 até 50. */

public class Exercicio2_3 {
    public static void main(String args[]) {
        int i;
        int somatorio = 0;
        for (i = 1; i < 51; i++) {
            somatorio += i;
        }

        System.out.println("O somatorio dos numeros inteiros de 1 a 50 eh: " + somatorio);
    }

}
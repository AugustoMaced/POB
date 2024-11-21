/*Elabore um programa que leia a idade de diversas pessoas e ao final informe: o total de pessoas cadastradas, a
porcentagem de pessoas com idade inferior a 18 anos, a porcentagem de pessoas com idade igual ou superior a 18 anos.
 */

 import java.util.Scanner;

public class Exercicio6_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de pessoas: ");
        int qtd = scanner.nextInt();
        
        int i;
        int contMaior=0;
        int contMenor=0;

        for(i=0; i < qtd; i++)
        {
            System.out.print("Entre com a sua idade: ");
            int idades = scanner.nextInt();

            if(idades < 18) {
                contMaior++;
            } else{
                contMenor++;
            }
        }

        float pMaior = ((float)contMaior / qtd) * 100;
        float pMenor = ((float)contMenor / qtd) * 100;


        System.out.println("A quantidade de pessoas cadastradas eh: " + qtd);
        System.out.println("A porcentagem de pessoas menores de 18 anos eh: " + pMenor);
        System.out.println("A porcentagem de pessoas maiores de 18 anos eh: " + pMaior);
   
        scanner.close();
    }
}
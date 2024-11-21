/* Faça um programa para solicitar o nome e as duas notas de um aluno. Calcular sua média e informá-la.
 Se ela for inferior a 7, escrever "Reprovado”; caso contrário escrever "Aprovado".
 */

 import java.util.Scanner;
public class Exercicio3_2 {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Entre com  nota da AV1: ");
        float av1 = scanner.nextFloat();
        System.out.print("Entre com a nota da AV2: ");
        float av2 = scanner.nextFloat();

        float media = (av1 + av2) / 2;

        if(media < 7)
        {
            System.out.println("Reprovado.");
        } else{
            System.out.println("Aprovado.");
        }
            
        scanner.close();
    }
}
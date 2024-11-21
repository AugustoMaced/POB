/*Crie um programa para solicitar o ano atual e o ano de nascimento de uma pessoa. Calcular sua idade aproximada e informá-la.
 Se sua idade for inferior a 16 anos, escrever a mensagem "Não pode votar"; caso contrário, emitir a mensagem "É eleitor".
 */

 import java.util.Scanner;

public class Exercicio2_2 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o ano atual: ");
        int anoAtual = scanner.nextInt();
        System.out.print("Entre com o seu ano de nascimento: ");
        int anoNas = scanner.nextInt();

        int idadeAprox = anoAtual - anoNas;

        if(idadeAprox < 16)
        {
            System.out.println("Não pode votar.");
        } else{
            System.out.println("Eh eleitor.");
        }
        scanner.close();
    }
}
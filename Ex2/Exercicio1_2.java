/*Faça um programa para solicitar o nome e a idade de uma pessoa.
 Se sua idade for menor que 18 anos, escrever a mensagem: "É menor".*/

 import java.util.Scanner;

 public class Exercicio1_2 {
    public static void main(String argas[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Entre com a sua idade: ");
        int idade = scanner.nextInt();

        if(idade < 18)
        {
            System.out.println("Eh menor que 18 anos.");
        } else{
            System.out.println("Eh igual ou maior de 18 anos.");
        }

        scanner.close();
    }
 }
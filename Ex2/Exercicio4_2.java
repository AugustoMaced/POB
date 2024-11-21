/* Elabore um programa para solicitar o nome, o sexo e o salário bruto de um empregado.
 Se o seu sexo for masculino, descontar 5% de seu salário;
 caso contrário, descontar 3%. Informar o valor do desconto e o salário líquido. */

 import java.util.Scanner;

public class Exercicio4_2 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Entre com o seu sexo(M/F): ");
        char sexo = Character.toUpperCase(scanner.next().charAt(0));
        System.out.print("Entre com o seu salario bruto: R$");
        float salario = scanner.nextFloat();

        float desconto;

        if(sexo == 'M')
        {
            desconto = 0.05f * salario;

        } else{
            desconto = 0.03f * salario; 
        }

        float valor = salario - desconto;

        System.out.println("Seu salario liquido eh: R$" + valor);
        System.out.println("O valor do desconto eh: R$" + desconto);
        scanner.close();
    }
}
/*Faça um programa para solicitar o código, a quantidade de alunos do sexo masculino, a quantidade de alunos do sexo feminino
 e a quantidade de alunos aprovados de uma determinada turma. Calcular e informar: a porcentagem de alunos do sexo masculino;
 a porcentagem de alunos do sexo feminino; a porcentagem de alunos reprovados; o total de alunos da turma. */
import java.util.Scanner;


public class Exercicio3 {
    public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entre com o codigo do aluno: ");
            int codigo = scanner.nextInt();
            System.out.print("Entre com a qtd de alunos do sexo masculino: ");
            int masc = scanner.nextInt();

            System.out.print("Entre com a qtd de alunos do sexo feminino: ");
            int fem = scanner.nextInt();
            System.out.print("Entre com a quantidade de alunos aprovados: ");
            int qtd = scanner.nextInt();



            int totalAlunos = fem + masc;
            int totalReprovados = totalAlunos - qtd;
            float pfem = ((float)fem / totalAlunos) * 100;
            float pmasc = ((float)masc / totalAlunos) * 100;
            float preprovados = ((float) totalReprovados / totalAlunos) * 100;

            System.out.println("A porcentagem de alunos do sexo masculino eh: " + pmasc + "%");
            System.out.println("A porcentagem de alunos do sexo feminino eh: " + pfem + "%");
            System.out.println("A porcentagem de alunos reprovados eh: " + preprovados + "%");
            System.out.println("A quantidade total de alunos eh: " + totalAlunos);
            scanner.close();
            }
    }
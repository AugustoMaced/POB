/*Dado três valores X,Y,Z, verificar se eles podem ser o comprimento dos lados de um triângulo e,
se forem, verificar se é um triângulo, equilátero, isósceles ou escaleno. Se eles não formarem um triângulo,  escreverem uma mensagem.
 Obs: O comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados;
chama-se triângulo equilátero ao triângulo que tem os comprimentos dos três lados iguais; chama-se triângulo isósceles ao triângulo
 que tem os comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é também isósceles;
chama-se triângulo escaleno ao triângulo que tem os comprimentos dos três lados diferentes. */

import java.util.Scanner;

public class Exercicio9_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o X: ");
        int x = scanner.nextInt();
        System.out.print("Entre com o Y:");
        int y = scanner.nextInt();
        System.out.print("Entre com o Z:");
        int z = scanner.nextInt();

        if ((x > y + z) || (y > x + z) || (z > x + y)) {
            System.out.print("Nao forma um triangulo.");
        } else if ((x == y) && (x == z)) {
            System.out.print("O triangulo eh equilatero e isosceles");
        } else if ((x == y) || (x == z)) {
            System.out.print("O triangulo eh isosceles");
        } else {
            System.out.print("O triangulo eh escaleno");
        }
        scanner.close();
    }
}
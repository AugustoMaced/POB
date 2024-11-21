/*Faça um programa que dado o valor da temperatura em graus FARENHEIT, calcular e escrever o valor da temperatura em graus CELSIUS.
 Fórmula: C = 5/9 * (F - 32)
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {
    public static void main(String[] args){
    try (Scanner scanner = new Scanner(System.in)) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a temperatura em Celsius: ");
        float temperatura = scanner.nextFloat();
        
        float conversor = (temperatura * (1.8f)) + 32;
        System.out.println("A mesma temperatura, em Fahrenheit, equivale a: " + df.format(conversor));
    }
}
}

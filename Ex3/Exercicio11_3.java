/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
 Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo necessário 
 para que essa massa se torne menor do que 0.5 gramas. 
 Escreva a massa final, e o tempo. Observação: o usuário deve digitar a massa inicial.
 */

 import java.util.Scanner;

public class Exercicio11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a massa inicial: ");
        float massa = scanner.nextFloat();

        int tempo = 0;

        while(massa > 0.5) {
            massa /= 2;
            tempo += 50;
        }

        System.out.println("A massa final eh: " + massa);
        System.out.println("O tempo que foi levado foi: " + tempo + "segundos");

        scanner.close();
    }
}
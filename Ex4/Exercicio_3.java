import java.util.*;

public class ConsultaPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> codigos = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        List<String> telefones = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o código da pessoa " + (i + 1) + ": ");
            codigos.add(scanner.nextInt());
            scanner.nextLine(); // Consumir o newline
            System.out.print("Digite o nome de " + codigos.get(i) + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite o telefone de " + nomes.get(i) + ": ");
            telefones.add(scanner.nextLine());
        }

        while (true) {
            System.out.print("Digite o código para consulta (ou -1 para sair): ");
            int codigoConsulta = scanner.nextInt();
            if (codigoConsulta == -1) break;

            int index = codigos.indexOf(codigoConsulta);
            if (index != -1) {
                System.out.println("Nome: " + nomes.get(index) + ", Telefone: " + telefones.get(index));
            } else {
                System.out.println("Código não encontrado.");
            }
        }
    }
}
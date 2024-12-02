import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Incluir paciente");
            System.out.println("2 - Alterar paciente");
            System.out.println("3 - Excluir paciente");
            System.out.println("4 - Consultar paciente");
            System.out.println("5 - Listar todos os pacientes");
            System.out.println("6 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Incluir paciente
                    System.out.println("Digite o número do paciente:");
                    int numero = scanner.nextInt();
                    System.out.println("Digite o peso do paciente:");
                    double peso = scanner.nextDouble();
                    System.out.println("Digite a altura do paciente:");
                    double altura = scanner.nextDouble();
                    Paciente novoPaciente = new Paciente(numero, peso, altura);
                    hospital.incluirPaciente(novoPaciente);
                    break;

                case 2: // Alterar paciente
                    System.out.println("Digite o número do paciente para alterar:");
                    numero = scanner.nextInt();
                    System.out.println("Digite o novo peso do paciente:");
                    peso = scanner.nextDouble();
                    System.out.println("Digite a nova altura do paciente:");
                    altura = scanner.nextDouble();
                    hospital.alterarPaciente(numero, peso, altura);
                    break;

                case 3: // Excluir paciente
                    System.out.println("Digite o número do paciente para excluir:");
                    numero = scanner.nextInt();
                    hospital.excluirPaciente(numero);
                    break;

                case 4: // Consultar paciente
                    System.out.println("Digite o número do paciente para consultar:");
                    numero = scanner.nextInt();
                    hospital.consultarPaciente(numero);
                    break;

                case 5: // Listar todos os pacientes
                    hospital.listarTodosPacientes();
                    break;

                case 6: // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

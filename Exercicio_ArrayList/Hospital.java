import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> pacientes;

    public Hospital() {
        pacientes = new ArrayList<>();
    }

    // Incluir um paciente
    public void incluirPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente incluído com sucesso.");
    }

    // Alterar um paciente pelo número
    public void alterarPaciente(int numero, double peso, double altura) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                paciente.setPeso(peso);
                paciente.setAltura(altura);
                System.out.println("Paciente alterado com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    // Excluir um paciente pelo número
    public void excluirPaciente(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                pacientes.remove(paciente);
                System.out.println("Paciente excluído com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    // Consultar um paciente pelo número
    public void consultarPaciente(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                paciente.listarPaciente();
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    // Listar todos os pacientes
    public void listarTodosPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Não há pacientes cadastrados.");
        } else {
            for (Paciente paciente : pacientes) {
                paciente.listarPaciente();
                System.out.println("------------------------");
            }
        }
    }
}

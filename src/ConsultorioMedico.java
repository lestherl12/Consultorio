import java.util.ArrayList;
import java.util.List;

class ConsultorioMedico {
    private List<Paciente> pacientes;
    private List<Medico> medicos;

    public ConsultorioMedico() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
    }

    public static void paciente() {
    }

    public static void medico() {
    }

    public static void seleccinarmedico(int i) {
    }

    public static void seleccinarpaciente(int i) {
    }

    public static void seleccionarmedico(int i) {
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void mostrarPacientes() {
        System.out.println("Lista de Pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println("Nombre: " + paciente.getNombre() + ", Edad: " + paciente.getEdad());
        }
    }

    public void mostrarMedicos() {
        System.out.println("Lista de Médicos:");
        for (Medico medico : medicos) {
            System.out.println("Nombre: " + medico.getNombre() + ", Edad: " + medico.getEdad() + ", Especialidad: " + medico.getEspecialidad());
        }
    }

    public void agregarPacienteConsulta(int i) {
    }

    public void agregarMedicoConsulta(int i) {
    }

    public void mostrarConsulta() {
    }
}
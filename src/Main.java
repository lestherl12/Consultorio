
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultorioMedico consultorio = new ConsultorioMedico();

        Paciente paciente1 = new Paciente("Juan Pérez", 30);
        Paciente paciente2 = new Paciente("María González", 25);

        Medico medico1 = new Medico("Dr. Carlos García", 40, "Pediatría");
        Medico medico2 = new Medico("Dra. Ana Martínez", 35, "Cardiología");

        consultorio.agregarPaciente(paciente1);
        consultorio.agregarPaciente(paciente2);
        consultorio.agregarMedico(medico1);
        consultorio.agregarMedico(medico2);

        consultorio.mostrarPacientes();
        consultorio.mostrarMedicos();

        while (true) {
            System.out.println("1. Agregar paciente a consulta");
            System.out.println("2. Agregar medico a consulta");
            System.out.println("3. Ver lista de pacientes y medicos agregados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    consultorio.mostrarPacientes();
                    System.out.print("Seleccione el índice del paciente a agregar: ");
                    int indicePaciente = scanner.nextInt();
                    scanner.nextLine();
                    consultorio.agregarPacienteConsulta(indicePaciente - 1);
                    break;

                case 2:
                    consultorio.mostrarMedicos();
                    System.out.print("Seleccione el índice del medico a agregar: ");
                    int indiceMedico = scanner.nextInt();
                    scanner.nextLine();
                    consultorio.agregarMedicoConsulta(indiceMedico - 1);
                    break;

                case 3:
                    System.out.println("Medicos y pacientes agregados:");
                    consultorio.mostrarConsulta();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}


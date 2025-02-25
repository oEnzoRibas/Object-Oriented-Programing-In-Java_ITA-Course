package ITA_POO_JAVA.Module1.Calcular_IMC;

public class Principal {
    public static void main(String[] args) {
        Paciente pacienteA = new Paciente(60, 1.93);
        Paciente pacienteB = new Paciente(120, 2.0);
        Paciente pacienteC = new Paciente(60, 1.60);

        System.out.printf("""

            Paciente A = %s
            Paciente B = %s
            Paciente C = %s
                """,pacienteA.diagnostico(),pacienteB.diagnostico(),pacienteC.diagnostico());

    }
}
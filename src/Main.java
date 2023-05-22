import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del empleado:"));
        String nombres = JOptionPane.showInputDialog("Ingrese los nombres del empleado:");
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas trabajadas al mes:"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la hora trabajada:"));
        double retencionFuente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de retención en la fuente:"));

        Empleado empleado = new Empleado(codigo, nombres, horasTrabajadas, valorHora, retencionFuente);

        String resultado = "Código: " + empleado.getCodigo() + "\n" +
                "Nombres: " + empleado.getNombres() + "\n" +
                "Salario bruto: $" + empleado.calcularSalarioBruto() + "\n" +
                "Salario neto: $" + empleado.calcularSalarioNeto();

        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

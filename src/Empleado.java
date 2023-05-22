public class Empleado {
    private int codigo;
    private String nombres;
    private int horasTrabajadas;
    private double valorHora;
    private double retencionFuente;

    public Empleado(int codigo, String nombres, int horasTrabajadas, double valorHora, double retencionFuente) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        double retencion = salarioBruto * (retencionFuente / 100);
        return salarioBruto - retencion;
    }
}

package herencia.cuenta;

public class CuentaAhorro extends Cuenta{

    private double interesAnual;

    public CuentaAhorro(String titular, double saldo, double interesAnual){
        super(titular, saldo);
        this.interesAnual = interesAnual;
    }

    @Override
    public String mostrarDatos() {
        return "Cuenta de Ahorro - Titular: " + titular +
                ", saldo : " + saldo + ", interés anual :"
                + interesAnual + "%";
    }
}

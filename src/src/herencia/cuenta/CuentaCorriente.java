package herencia.cuenta;

public class CuentaCorriente extends Cuenta{

    private double limiteDescubierto;

    public CuentaCorriente(String titular, double saldo, double limiteDescubierto){
        super(titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public String mostrarDatos() {
        return "Cuenta Corriente - Titular: " + titular +
                ", saldo: " + saldo + ", límite de descubierto: " + limiteDescubierto;
    }
}

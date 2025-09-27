package herencia.cuenta;

public class Cuenta {

    protected String titular;
    protected double saldo;

    public Cuenta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }

    public String mostrarDatos(){
        return "No implementado";

    }
}

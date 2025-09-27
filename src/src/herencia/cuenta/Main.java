package herencia.cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta[] cuentas = {
                new CuentaAhorro("Emilio", 100000, 8),
                new CuentaAhorro("Pepe", 12000, 60),
                new CuentaAhorro("Elena", 20000, 10),
                new CuentaCorriente("Alex", 150000, 15000),
                new CuentaCorriente("Laura", 13000, 500),
                new CuentaCorriente("Jose", 25000, 350)};
        for (Cuenta c : cuentas){
            System.out.println(c.mostrarDatos());
        }
    }

}

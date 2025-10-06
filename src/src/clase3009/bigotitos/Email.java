package clase3009.bigotitos;

public class Email implements Enviable {

    private String direccion;

    public Email(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void enviar(String mensaje){
        System.out.println("Enviando emial a " + this.direccion +
                 " mensaje: " + mensaje);
    }
}

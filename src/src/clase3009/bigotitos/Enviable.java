package clase3009.bigotitos;

public interface Enviable {

    void enviar(String mensaje);

    default void confirmar(){
        System.out.println("Mensaje enviado correctamente.");
    }

}

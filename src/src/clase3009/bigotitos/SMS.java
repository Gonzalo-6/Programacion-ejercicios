package clase3009.bigotitos;

public class SMS implements Enviable{

    private String numero;

    public SMS(String numero) {
        this.numero = numero;
    }

    public void enviar(String mensaje){
        System.out.println("Enviando SMS al " + this.numero +
                ": " + mensaje);

    }
}

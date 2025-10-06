package clase3009.bigotitos;

import java.util.ArrayList;
import java.util.List;


public class main {

    public static void main(String[] args){
        List<Enviable> servicios = new ArrayList<>();
        servicios.add(new Email("cliente@pepe.com"));
        servicios.add(new SMS("+34652656968"));

        for (Enviable e : servicios){
            e.enviar("Pedido enviado");
            e.confirmar();
        }
    }
}

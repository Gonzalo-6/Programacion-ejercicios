package Interfaces.interfacesComportamiento;

public class Cancion implements Reproducible{

        @Override
        public void reproducir() {
            System.out.println("Reproduciendo canción...");
        }

}

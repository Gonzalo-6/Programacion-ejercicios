package Interfaces.interfacesComportamiento;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    // Crear una lista de elementos Reproducible
        List<Reproducible> lista = new ArrayList<>();

    // Añadir una canción y un video a la lista
        lista.add(new Cancion());
        lista.add(new Video());

    // Reproducir todos los elementos
        for (Reproducible r : lista) {
            r.reproducir();
        }
    }
}


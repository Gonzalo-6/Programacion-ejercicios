package Interfaces.herenciaConInterfaces;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Vendible> productos = new ArrayList<>();

        productos.add(new ProductoFisico("Libro", 20.0, 3.5));
        productos.add(new ProductoFisico("Auriculares", 50.0, 5.0));
        productos.add(new ProductoDigital("E-book", 15.0, 2.0));
        productos.add(new ProductoDigital("Curso Online", 100.0, 20.0));

        for (Vendible p : productos) {
            if (p instanceof Producto) {
                Producto prod = (Producto) p;
                System.out.println(prod.getNombre() + " → Importe final: " + prod.calcularImporte() + " €");
            }
        }
    }

}

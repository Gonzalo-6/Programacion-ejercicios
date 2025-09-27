package herencia.biblioteca;

public class Main {
    public static void main(String[] args){

        Recurso[] recursos = { new Libro("El señor de los gramillos", "Jamal", 120),
                new Libro("Cuentame tu vida", "Perico el de los Palotes", 202),
                new Revista("Paginas verdes", "Maruja", 4),
                new Revista("Todo mi corazón", "Anne", 6)

        };

        for (Recurso r : recursos){
            System.out.println(r.mostrarInfo());
        }
    }
}

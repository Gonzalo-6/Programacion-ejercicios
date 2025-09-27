package herencia.biblioteca;

public class Revista extends Recurso{

    protected double numeroEdicion;

    public Revista(String titulo, String autor, double numeroEdicion){
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String mostrarInfo(){
        return "El titulo es: " + titulo + ", el autor es: " + autor +
                "y su edición es: ";
    }
}

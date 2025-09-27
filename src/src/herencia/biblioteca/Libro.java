package herencia.biblioteca;

public class Libro extends Recurso{

    protected double numeroPaginas;

    public Libro(String titulo, String autor,double numeroPaginas){
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String mostrarInfo(){
        return "El titulo es: " + titulo + ", el autor es: " + autor +
                "contiene " + numeroPaginas + "paginas.";
    }
}

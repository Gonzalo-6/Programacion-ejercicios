package herencia.biblioteca;

public abstract class Recurso {
    protected String titulo;
    protected String autor;


    public Recurso(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
public abstract String mostrarInfo();

}

package Interfaces.herenciaConInterfaces;

public abstract class Producto implements Vendible{

    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    public abstract double calcularPrecioFinal();


    @Override
    public double calcularImporte(){
        return calcularPrecioFinal();
    }

    public String getNombre(){
        return nombre;
    }
}

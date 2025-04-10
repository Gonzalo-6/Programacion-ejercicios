package Clase7;

public class E5 {
    public static void main(String[] args){

            String nombre = null;
        try {
            System.out.println("La longitud del nombre es: " + nombre.length());
        }catch (NullPointerException e){
            System.out.println("Error el nombre no es null");
        }
    }
}

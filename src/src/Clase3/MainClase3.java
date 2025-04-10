package Clase3;

public class MainClase3 {public static void main(String[] arg) {
    //1.Conversion implicita de int a double
    int numeroEntero = 25;
    double numeroDecimal = numeroEntero;

    System.out.println("Número entero: " + numeroEntero);
    System.out.println("Número convertido a doble: " + numeroDecimal);

    //2. Conersión explicita double a int con truncamiento

    double valorDecimal = 8.80;
    //conersión explicita, casting
    int valorEntero = (int) numeroDecimal;

    System.out.println("Valor original, double: " + valorDecimal);
    System.out.println("Valor convertido con el int: " + valorEntero);

    //3. Desbordamiento. Int a byte
    int numeroGrande = 190;
    //Conversion explicita a byte
    byte numeroPequeño = (byte) numeroGrande;

    System.out.println("Numero original en int: " + numeroGrande);
    System.out.println("Numero convertido a byte: " + numeroPequeño);


    //6. Convertir un int a String
    int numerito = 456;
    String textito = String.valueOf(numerito);

    System.out.println("Numero : " + numerito);
    System.out.println("Texto convertido: " + textito);

    //7. Conversion double a String

    double precio = 99.99;
    String textoPrecio = Double.toString(precio);
    System.out.println("Precio como String: " + textoPrecio);

    //8. Conversion de boolean a String
    boolean activo = true;
    //conversion a String
    String estado = String.valueOf(activo);

    System.out.println("Estado convertido: " + estado);

    //9. Conversión para operaciones matematicas.
    int a = 5, b = 2;
    }
}

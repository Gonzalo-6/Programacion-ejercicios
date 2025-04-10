package Clase7;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] frutas = {"Manzana", "Banana", "Naranja"};

        try {

            System.out.print("Introduce un número entre 0 y 2: ");

            int posicion = sc.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error introducir números 0, 1 y 2");
        } finally {
            System.out.println("Se acabo");
        }
        sc.close();
    }
}

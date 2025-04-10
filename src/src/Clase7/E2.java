package Clase7;

import java.util.Scanner;

public class E2 {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Escribe un número: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);

            System.out.println("Número x 10: " + (numero * 10));
        }catch (NumberFormatException e) {
            System.out.println("Tienes que escribir los números");
        }finally {
            System.out.println("Fin del culebron");
        }


        sc.close();
    }
}

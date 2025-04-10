package Clase7;

import java.util.Random;
import java.util.Scanner;

public class E4 {
    static public void main(String[] args){

        Random random = new Random();

        Scanner sc = new Scanner(System.in);

          try {

        int secreto = random.nextInt(10) + 1;

        System.out.println("Adivina el número (1-10):");
        String intentoTexto = sc.nextLine();


            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            } catch (NumberFormatException e) {
                System.out.println("Así no funciona");
            } finally {
            System.out.println("JUego finalizado");
        }
        sc.close();


    }
}

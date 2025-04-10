package Clase7;

import java.util.Random;
import java.util.Scanner;

public class E4 {
    static public void main(String[] args) {

        Random random = new Random();

        int secreto = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);



        try {
            System.out.println("Adivina el número (1-10):");
            String intentoTexto = sc.nextLine();


            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e) {
            System.out.println("Así no funiona. El número era:" + secreto);
        } finally {
            System.out.println("Juego finalizado");
            sc.close();


        }
    }
}

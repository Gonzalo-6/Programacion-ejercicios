package Clase7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase7 {
    public static void main(String[] arg) {

                Scanner entrada = new Scanner(System.in);

                System.out.println("1. Saludar\n2.Salis");

                System.out.println("Elige una opción");

                try {
                    int opcion = entrada.nextInt();

                    int resultado = 5 / opcion;

                    switch (opcion) {
                        case 1 -> System.out.println("Hola");

                        case 2 -> System.out.println("Saliendo.....");

                        default -> System.out.println("Opción incorrecta");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Debes escribir un número");
                } catch (ArithmeticException e){
                    System.out.println("División por 0");
                }
                finally {
                    System.out.println("FIN");
                }



                entrada.close();

        }

    }
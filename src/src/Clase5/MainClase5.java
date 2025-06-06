package Clase5;

import java.util.Random;
import java.util.Scanner;
// Sin esto, no vas a poder pedirle al uuario dato alguno

public class MainClase5 {
    public static void main(String[] arg) {

        //Ejercicio 1 – Salir de un bucle while con break
        //Haz un programa que pida al usuario números enteros positivos. El programa debe terminar cuando el usuario introduzca el número 0.
        // Usa un bucle while con break.





        //Ejercicio 2 – Saltarse los múltiplos de 3 con continue
        //Escribe un programa que muestre los números del 1 al 10, excepto los múltiplos de 3.
        // Usa un bucle for con continue.

        //for (int i = 1;i<=10;i++){
        // if (i%3 == 0){
        //si es multiplo de 3, saltame
        // continue;
        // }
        //System.out.println(i);
        //}




        //Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
        //Haz un programa que busque el número 7 entre los números del 1 al 20.
        // Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.


        //for(int i=1;i<=20;i++){
        //if(i==7){
        //System.out.println("Has encontrado el numero !");
        // break;
        //    }
        //System.out.println((""));
        // }
        //Ejercicio 4 – Evitar mostrar letras vocales con continue
        //Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.

        //String palabra = "PROGRAMACION";
        //for (int i = 0;i<palabra.length();i++){
        //char letra = palabra.charAt(i);

        //if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
        //  continue;
        //System.out.println(letra);

        // }
        // Ejercicio 5 – Dividir dos números con try-catch
        //Haz un programa que divida dos números enteros introducidos por el usuario.
        // Usa try-catch para evitar que el programa se rompa si el divisor es 0.

        //Scanner scanner = new Scanner(System.in);

        //try {
        //System.out.print("Introduce el dividendo: ");
        //int dividendo = scanner.nextInt();
        //System.out.print("Introduce el divisor: ");
        //int divisor = scanner.nextInt();

        //int resultado = dividendo / divisor;
        //  System.out.println("El resultado de la división es: " + resultado);
        //} catch (ArithmeticException e) {
        //  System.out.println("Error: No se puede dividir por cero.");
        //} catch (java.util.InputMismatchException e) {
        //  System.out.println("Error: Por favor, introduce solo números enteros.");
        //} finally {
        //  scanner.close();
        //}



        //Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
        //Solicita una palabra al usuario y pide una posición.
        // Intenta mostrar el carácter en esa posición usando try-catch.
        // Si se produce un error, muestra un mensaje.

        //Scanner scanner = new Scanner(System.in);
        //try {
        //System.out.print("Introduce una palabra: ");
        //String palabra = scanner.next();
        //System.out.print("Introduce una posición: ");
        //int posicion = scanner.nextInt();

        //char caracter = palabra.charAt(posicion);
        //  System.out.println("El carácter en la posición " + posicion + " es: " + caracter);
        //} catch (StringIndexOutOfBoundsException e) {
        //  System.out.println("Error: La posición está fuera del rango de la palabra.");
        //} catch (java.util.InputMismatchException e) {
        //System.out.println("Error: Por favor, introduce un número entero para la posición.");
        //} finally {
        //   scanner.close();
        // }


        //Ejercicio 7 – Mensaje de fin con finally
        //Haz un programa que intente dividir dos números.
        // Usa try-catch-finally para mostrar siempre un mensaje final que diga "Operación terminada".
        //  Scanner scanner = new Scanner(System.in);

        //try {
        //  System.out.print("Introduce el dividendo: ");
        //int dividendo = scanner.nextInt();
        //System.out.print("Introduce el divisor: ");
        //int divisor = scanner.nextInt();

        //int resultado = dividendo / divisor;
        //  System.out.println("El resultado de la división es: " + resultado);
        //} catch (ArithmeticException e) {
        //  System.out.println("Error: No se puede dividir por cero.");
        //} catch (java.util.InputMismatchException e) {
        //  System.out.println("Error: Por favor, introduce solo números enteros.");
        //} finally {
        //System.out.println("Operación terminada.");
        //  scanner.close();
        //}

        //Ejercicio 8 – Leer números y sumar los positivos, ignorando los negativos con continue
        //Pide al usuario 5 números enteros. Suma solo los positivos usando continue para ignorar los negativos.

        //Scanner scanner = new Scanner(System.in);
        //int suma = 0;

        //System.out.println("Introduce 5 números enteros:");

        //for (int i = 0; i < 5; i++) {
        //try {
        //int numero = scanner.nextInt();
        //if (numero < 0) {
        //  continue;
        //}
        //  suma += numero;
        //} catch (java.util.InputMismatchException e) {
        // System.out.println("Error: Por favor, introduce solo números enteros.");
        //   scanner.next();
        //     i--;
        //   }
        // }

        //System.out.println("La suma de los números positivos es: " + suma);
        //scanner.close();

        //Ejercicio 9 – Detectar si se ha introducido texto en lugar de número (try-catch)
        //Pide al usuario que introduzca un número.
        // Si escribe una palabra u otro texto, el programa debe capturar la excepción y mostrar "Eso no es un número".

        //Scanner scanner = new Scanner(System.in);

        //System.out.print("Introduce un número: ");

        //try {
        //  int numero = scanner.nextInt();
        //System.out.println("Has introducido el número: " + numero);
        //} catch (java.util.InputMismatchException e) {
        //  System.out.println("Eso no es un número.");
        //} finally {
        //  scanner.close();
        //}

        //Ejercicio 10 – Salir de un bucle do-while cuando se adivina un número secreto
        //Crea un número secreto entre 1 y 10. El usuario tiene que adivinarlo.
        // Usa do-while y break para salir cuando acierte.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int intento;

        System.out.println("Adivina el número secreto entre 1 y 10:");

        do {
            System.out.print("Introduce tu número: ");
            try {
                intento = scanner.nextInt();
                if (intento == numeroSecreto) {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    break;
                } else {
                    System.out.println("Intenta de nuevo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Eso no es un número válido.");
                scanner.next();
            }
        } while (true);

        scanner.close();
    }
}

package Clase2;

import java.util.Scanner;

public class MainClase2 {
    public static void main(String[] args){
        final double PI = 3.1416;//constante de tipo double
        final int EDAD_MAXIMA = 100; // constante de tipo entero
        System.out.println("EL valor de PI es: " + PI);
        System.out.println("La edad maxima permitida es: " + EDAD_MAXIMA);

        // Operaciones aritmeticas
        int a = 8, b = 3;
        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " +(a-b));
        System.out.println("Multiplcación: " + (a*b));
        System.out.println("División: " + (a/b));
        System.out.println("Módulo: " + (a%b));


        //Operadores relacionales
        int x = 10, y = 20;
        System.out.println("¿x es igual a y?"  + (x==y));
        System.out.println("¿x es diferente de y?" + (x!=y));
        System.out.println("¿x es mayor que y?" + (x>y));
        System.out.println("x es menos que y?" + (x<y));


        //Operadores lógicos
        boolean c = true, d = false;
        System.out.println("c AND d:" + (c&&d));
        System.out.println("c OR d:" + (c||d));
        System.out.println("NOt c:" + (!c));

        //Expresiones y evaluaciones
        int resultado = (10 + 5)*2/3;
        System.out.println("El resultado de la expresión es:" + resultado);

        //Ejercicio 1
        final double GRAVEDAD = 9.81; //Constante de tipo double
        System.out.println("LA constante de la gravedad es: " + GRAVEDAD);

        //Ejercicio 2
        int f = 25, g = 7;
        System.out.println("La Suma es: " + (f+g));
        System.out.println("La mierda de la resta es: " + (g-f));
        System.out.println("Multiplicación: " + (f*g));
        System.out.println("División es: " + (f/g));
        System.out.println("EL resto es: " + (f%g));

//Ejercico 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

//Ejercicio 4
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner1.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner1.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "es mauyor que " + num2);
       } else if (num1 < num2) {
            System.out.println(num1 + "es menor que " + num2);
       }else {
            System.out.println("Ambos números son iguales. ");
        }
            scanner1.close();

// Ejerciocio 5 y 6
        boolean resultado1 = (5>3) || (10<20);
        System.out.println("El resultado de la expresión es: " + resultado1);

        boolean resultado2 = (5>3) && (10<20);
        System.out.println("el resultado de la expresión es: " + resultado2);

//Ejercicio 7
        int q = 10;
        int w = 20;
        int z = 30;
        System.out.println("q + w == z: " + (q +w == z));
        System.out.println("q + w > z: " + (q + w > z));
        System.out.println("q + w < z: " + (q + w < z));
        System.out.println("q + w >= z: " + (q + w >= z));
        System.out.println("q + w <= z: " + (q + w <= z));
        System.out.println("q + w != z: " + (q + w != z));


//Ejercicio 8
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Pon un número: ");
        int num5 = scanner3.nextInt();

        System.out.println("Pon otro número");
        int num4 = scanner3.nextInt();
        if (num4 != 0 && num5 % num4 == 0) {
            System.out.println(num5 + "es multiplo de " +num4);
        }else {
            System.out.println(num5 + "no es multiplo de " + num4);
        }
        scanner3.close();

        }
    }



package clase2705;

import java.util.Scanner;

//Funciones//
public class clase {
    public static void main(String[] args){



        int [] numeros = {1,5,6,8,10};
        System.out.println("La media es : " + String.format("%.2f",calacularmedia(numeros)));


        String email = "pepe@gmail.com";

        String nombreusuario = email.substring(0,email.indexOf("@"));
        System.out.println(nombreusuario);

        String servidor = email.substring(email.indexOf("@") + 1);

        System.out.println(servidor);

        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = ent.nextInt();


        if (esPar(num)){
            System.out.println("Es par");
        }else {
            System.out.println("No es par");
        }




        System.out.println(esPar(4));
        System.out.println(sumar(5,7));
        System.out.println(sumar(1,2,3,4,5,6,67,7,8,99,9));
        System.out.println(sumar());

        String name = "Maria";
        saludar();

        saludar("Juan");
        System.out.println(saludar2(name));
    }

    //1. Imprime un saludo
    public static void saludar(){
        System.out.println("Hola");
    }

    public static void saludar(String nombre){
        System.out.println("Hola," + nombre + "!");
    }

    public static String saludar2(String nombre){
        return ("Hola," + nombre + "!");
    }

    public static int sumar(int n1, int n2){

        return n1 + n2;
    }

    public static int sumar(int... numeros){
        int suma = 0;
        for (int n: numeros){
            suma += n;

        }
        return suma;
    }
    public static boolean esPar(int n1){
        if (n1% 2== 0){
            return true;
        }else{
            return false;
        }
    }

    public static double calacularmedia(int [] numeros){
        int suma = 0;
        for (int n : numeros){
            suma += n;
        }
        return (double) suma / numeros.length;
    }

}

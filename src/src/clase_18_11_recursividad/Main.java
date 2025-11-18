package clase_18_11_recursividad;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Main {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sumarHasta(int n){

        if (n == 0){
            return 0;
        }else {
            return n + sumarHasta(n-1);
        }
    }

    public static long sumarRecursivo(int[] v, int i){
        if (i == v.length){
            return 0;
        }else {
            return v[i] + sumarRecursivo(v, i+1);
        }

    }


    public static long sumarIterativo(int[] v) {
        long suma = 0;
        for(int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma;
    }

    public static int sumarDigitos(int n){
        if (n < 10){
            return n;
        }else{
            return (n%10) + sumarDigitos(n/10);
        }
    }



    public static void main(String[] args) {

        System.out.println(sumarDigitos(1234));
        int n = 10000;

        int[] datos = new int [n];
        Random r = new Random();

        for (int i =0;i<n; i++){
            datos[i]= r.nextInt(100);
        }

        //Tiempo iterativo

        long inicioIter = System.nanoTime();
        long resultadoIter = sumarIterativo(datos);
        long finIter = System.nanoTime();
        long tiempoIter = finIter - inicioIter;

        //Tiempo recursivo

        long inicioRecur = System.nanoTime();
        long resultadoRecur = sumarRecursivo(datos, 0);
        long finRecur = System.nanoTime();
        long tiempoRecur = finRecur - inicioRecur;


        //System.out.println("Resultado Iterativo: " + resultadoIter);
        //System.out.println("Resultado Recursivo: " + resultadoRecur);

        //System.out.println("Resultado tiempo Iterativo: " + tiempoIter);
        //System.out.println("Resultado tiempo Recursivo: " + tiempoRecur);



    }
}
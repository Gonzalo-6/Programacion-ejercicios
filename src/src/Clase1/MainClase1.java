package Clase1;

public class MainClase1 {
        public static void main(String[] arg){
   byte numeroByte = 127; //Número pequeño (-128 a 127)
               System.out.println("byte (8 bits): " +numeroByte);
//Ejercicio 1

            byte Byte = 100; // Rango: -128 a 127
            short Short = 20000; // Rango: -32,768 a 32,767
            int Int = 1500000000; // Rango: Número grande
            long Long = 90000000000L; // Rango: Número muy largo

            System.out.println("Variable pequeña: " + Byte);
            System.out.println("Variable medina: " + Short);
            System.out.println("Variable grande: " + Int);
            System.out.println("VArable muy grande" + Long);

 // Ejercicio 2
            float Float = 2.21f; //     Número decimal
            System.out.println("floar: " +Float);

            double Double = 2.5637489342;
            System.out.println("Valor del Double: " + Double);

//Ejercicio 3
            boolean Miprima = false;
            if (Miprima){
                System.out.println("La variable es verdadera.");
            }else {
                    System.out.println("La variable es falsa.");
                }

//Ejercio 4
            char Inicial = 'G';
            char Simbolo = '$';
            System.out.println("Aqui tienes mi código: " + Inicial + Simbolo);

// Ejercicio 5

            String nombre = "Gonzalo";
            String lengua = "Español";
            System.out.println("Yo me llamo " + nombre);
            System.out.println("Y hablo el " + lengua);

// Ejercicio 6

            String[] nombres = {"Lara", "Mikel", "Antonio", "Paco", "Elena"};
            for (int i= 0; i < nombres.length; i++){
                System.out.println("Nombre " +(i + 1) + ":" + nombres[i]);
            }

// Ejercicio 7

              System.out.println(23);
            System.out.println(3.14);
            System.out.println(true);
            System.out.println("Soy un puto maquina");
        }

}
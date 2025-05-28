package clase2005;
import java.util.*;

public class clase {
    public static void main(String[] args){

        HashMap<String,Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0);
        notas.put("Luis", 5.0);
        notas.put("Pepe", 9.0);
        notas.put("Jose", 9.0);
        notas.put("Antonio", 9.0);
        notas.put("Juan", 9.0);
        notas.put("Luisa", 9.0);
        //for each para recorrer un mapa
        for (Map.Entry<String, Double> entrada : notas.entrySet()){

            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = scanner.nextLine();

        if (notas.containsKey(nombre)){
            System.out.println(nombre + "tiene una nota de :" + notas.get(nombre));
        }else{
            System.out.println("Estudiante no encontrado");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        TreeMap<String, Double> ordenado = new TreeMap<>(notas);


        for(Map.Entry<String, Double> entrada : ordenado.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }

    }

}

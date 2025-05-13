package clase1305;

public class clase {
    public static void main(String[] args){


        int[][] matriz1 = new int[3][4];

        int[][] matriz2 = {
                {1,2,3,8},
                {4,5,6,9},
                {7,8,9,10}
        };

        System.out.println("Número......:" + matriz2.length);
        System.out.println("Número de columnas: " +matriz2[1].length);

        for (int i = 0; i < matriz2.length; i ++){
            for ( int j = 0; j < matriz2[i].length; j++){

                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        matriz2[1][1] = 30;

        for (int[] fila : matriz2) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
        }
    }
}

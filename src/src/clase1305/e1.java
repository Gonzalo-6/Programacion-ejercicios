package clase1305;

public class e1 {
    static public void main(String[] args){


        int [] [] matriz1 = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };

        int [] [] matriz2 = {
                {1,2,3},
                {1,2,3},
                {1,2,3},
        };

        int [][] suma = new int[3][3];

        for (int i= 0; i < 3; i++){
            for(int j= 0; j < 3;  j++){

                suma[i][j] = matriz1[i][j] + matriz2[i][j];

            }
        }

        System.out.println("La suma de las matrices es: ");
        for (int i= 0; i<3; i++){
            for (int j= 0; j<3; j++){
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

    }
}

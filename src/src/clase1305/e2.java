package clase1305;
import java.util.Random;
public class e2 {
    static public void main(String[] args){

        int[][] matriz = new int[4][4];

        Random random = new Random();


        for (int i= 0; i<4; i++){
            for (int j= 0; j<4; j++){

                matriz[i][j]= random.nextInt(100) +1;


            }


        }

        for (int i= 0; i<4; i++){
            for (int j= 0; j<4; j++){

                System.out.print(matriz[i][j] +"\t");

            }

            System.out.println();
        }

        int[][] transpuesta = new int[4][4];

        for (int i= 0; i<4; i++){
            for (int j= 0; j<4; j++){

            }

        }

        System.out.println();
    }
}

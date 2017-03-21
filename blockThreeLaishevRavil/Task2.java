package blockThreeLaishevRavil;

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int [][] massiv = new int [5][8];
        int max = -100;
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                massiv [i][j] = rnd.nextInt(200) - 100;

            }

        }
        for (int i = 0; i < 5; i++,System.out.println()) {
            for (int j = 0; j < 8; j++) {
                System.out.print(massiv [i][j] + " ");
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {

                if (max < massiv [i][j]){
                    max = massiv [i][j];
                }

            }

        }
        System.out.println();
        System.out.println("Максимальное значение массива равно "+max);
    }

}

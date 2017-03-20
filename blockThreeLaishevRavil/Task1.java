package blockThreeLaishevRavil;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] massiv = new int[8][5];
        Random rnd = new Random();
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                massiv[i][j] = rnd.nextInt(89) + 10;

            }

        }
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                System.out.println(massiv[i][j] + " ");
            }
        }
    }
}

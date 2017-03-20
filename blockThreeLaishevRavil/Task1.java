package blockThreeLaishevRavil;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] massiv = new int[8][5];
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                massiv[i][j] = rnd.nextInt(89) + 10;

            }

        }
        for (int i = 0; i < 8; i++,System.out.println()) {
            for (int j = 0; j < 5; j++) {
                System.out.print(massiv[i][j] + " ");
            }
        }
    }
}

package blockTwoLaishevRavil;

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(1000);
        // System.out.println(x);
        int a = x/100;
        int b1 = x%100;
        int b = b1/10;
        int c = x%10;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        int [] massiv = {a,b,c};
        int max = massiv[0];
        for (int i=0; i< massiv.length; i++){
            if (massiv[i]>max){
                max = massiv[i];
            }
        }
        System.out.println("В числе "+x+" наибольшая цифра "+max);
    }
}

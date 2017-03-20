package blockTwoLaishevRavil;

/**
 * Created by User on 20.03.2017.
 */
public class Task2_10 {
    public static void main(String[] args) {
        int i = 1000;
        int x,y;
        int kolvo = 0;
        while (i<=999999){
            x = i/1000;
            y = i%1000;

            int sum1 = 0;
            int a = x/100;
            int b1 = x%100;
            int b = b1/10;
            int c = x%10;
            sum1 = a+b+c;

            int sum2 = 0;
            int d = y/100;
            int e1 = y%100;
            int e = e1/10;
            int f = y%10;
            sum2 = d+e+f;

            if (sum1 == sum2){
                kolvo++;
            }
            i++;

        }
        System.out.println("Количество счачтливых билетов "+kolvo+" штук");


    }
}

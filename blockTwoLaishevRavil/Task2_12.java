package blockTwoLaishevRavil;

/**
 * Created by User on 20.03.2017.
 */
public class Task2_12 {
    public static void main(String[] args) {
        int sovp = 0;
        for (int h = 0; h<24; h++){
            int h2 = h%10;
            int h1 = h/10;
            for (int m = 0; m<59; m++){
                int m2 = m%10;
                int m1 = m/10;
                if (h1 == m2 && h2 == m1){
                    sovp++;
                }
            }

        }
        System.out.println("Количество совпадений равно "+sovp);

    }
}

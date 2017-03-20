package blockTwoLaishevRavil;

/**
 * Created by User on 20.03.2017.
 */
public class Task2_11 {
    public static void main(String[] args) {
        int kolvo = 0;
        boolean two = false;
        for (int i = 1; i < 50001; i++){
            int j = i;
            two = false;
            while (j > 0){
                if (j % 10 == 2){
                    two = true;
                    break;
                }
                j = j/10;
            }
            if(two){
                kolvo++;
            }
        }
        System.out.println("Количество бракованных табличек равно "+kolvo);
    }
}

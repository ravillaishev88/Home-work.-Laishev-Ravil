package blockTwoLaishevRavil;

/**
 * Created by User on 17.03.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] massiv = new int[55];
        for(int i = 0; i<massiv.length;i++){
            massiv[i] = i*2+1;
        }
        for(int i = 0; i<massiv.length;i++){
            System.out.println(massiv[i]);
        }
    }
}

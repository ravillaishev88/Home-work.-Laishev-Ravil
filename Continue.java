/**
 * Created by User on 14.03.2017.
 */
public class Continue {
    public static void main(String [] args){
        for (int i=0;i<=15;i++){
            if (i%2==0){   //Остаток от деления на 2 равен нулю
                continue;
            }
            System.out.println("Четное число - "+i);
        }
    }
}

/**
 * Created by User on 14.03.2017.
 */
public class Breaks {
    public static void main(String [] args){
        int i=0;
        while(true){
            if (i==15){
                break;   //Прерывание
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла!");
    }
}

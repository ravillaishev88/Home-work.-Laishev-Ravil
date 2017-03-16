package homework.LaishevRavil;
/**
 * Created by User on 11.03.2017.
 */
import java.util.Scanner;
public class Zadanie5 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите Ваш вес");
        double vesz = s.nextDouble();
        double vesl= vesz*0.9;
        System.out.println("Ваш вес на Венере составит "+vesl+" кг");
    }
}

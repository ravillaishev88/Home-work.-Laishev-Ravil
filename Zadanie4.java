/**
 * Created by User on 11.03.2017.
 */
import java.util.Scanner;
public class Zadanie4 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Введите трехзначное число");
        int x = s.nextInt();
        int a = x/100;
        int d = x - (a*100);
        int b = d/10;
        int c = d - (b*10);
        int f = a + b + c;
        System.out.println("Сумма цифр введенного числа равна "+f);
    }
}

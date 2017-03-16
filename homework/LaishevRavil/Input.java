package homework.LaishevRavil;

import java.util.Scanner;

/**
 * Created by User on 11.03.2017.
 */
public class Input {
    public static void main(String [] agrs){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = s.nextLine();
        System.out.println("Вы ввели "+string);
        System.out.println("Теперь введите число");
        int x = s.nextInt();
        System.out.println("Ваше любимое число "+x);
    }
}

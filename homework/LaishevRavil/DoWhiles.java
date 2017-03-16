package homework.LaishevRavil;

import java.util.Scanner;
public class DoWhiles {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите Пять(5)");
            value = scanner.nextInt();
        }
        while (value!=5);
        System.out.println("Вы ввели 5");
    }

}

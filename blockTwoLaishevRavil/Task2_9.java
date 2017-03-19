package blockTwoLaishevRavil;

import java.util.Scanner;
public class Task2_9 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner numb = new Scanner(System.in);
        long n = numb.nextLong();
        long kol = (long)Math.log10(n)+1;
        System.out.println("Количество цифр в числе равно "+kol);
        }
}

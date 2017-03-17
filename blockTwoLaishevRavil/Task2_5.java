package blockTwoLaishevRavil;

import java.util.Scanner;
public class Task2_5 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner numb = new Scanner(System.in);
        long n = numb.nextLong();
        for(long i = n; i>1; i--){
            n = n*(i-1);
        }
        System.out.println();
        System.out.println("Факториал введенного числа равен "+n);
    }
}

package homework.LaishevRavil;

import java.util.Scanner;
public class Zadanie3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите вещественное число!");
        double s = scanner.nextDouble();
        System.out.println("Округление: "+Math.round(s));
    }
}

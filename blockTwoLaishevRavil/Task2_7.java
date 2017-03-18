package blockTwoLaishevRavil;

import java.util.Scanner;
public class Task2_7 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner numb = new Scanner(System.in);
        double x = numb.nextDouble();
        double b = Math.sqrt(x);
        for (int i= 2; i<b; i++){
            if (x%i==0){
                System.out.println("Это не простое число");
                break;
            }
            else{
                System.out.println("Это простое число");
            }
        }
    }
}

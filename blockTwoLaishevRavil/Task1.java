package blockTwoLaishevRavil;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число из диапозона от 5 до 155!");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        if (num<5 | num>155){
            System.out.println("Вы ввели не корректное число!!!");
        }
        else if (num<25 | num>100){
            System.out.println("Число "+num+" не содержится в интервале (25;100)");
        }
        else{
            System.out.println("Число "+num+" содержится в интервале (25;100)");
        }
    }
}

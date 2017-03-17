package blockTwoLaishevRavil;

import java.util.Scanner;
public class Task2_6 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner numb = new Scanner(System.in);
        long n = numb.nextLong();
        System.out.println();
        System.out.println("Все натуральные делители числа "+n);
        for(long i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }
    }
}

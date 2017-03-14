import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Switch {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        int age = scanner.nextInt();
        switch(age){
            case 1:
                System.out.println("Вы ребенок");
                break;
            case 15:
                System.out.println("Вы подросток");
                break;
            case 20:
                System.out.println("Вы совершеннолетний");
                break;
            default:
                System.out.println("Вы нам не подходите!");
        }
    }

}

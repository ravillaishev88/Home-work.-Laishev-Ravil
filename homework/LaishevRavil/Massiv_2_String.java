package homework.LaishevRavil;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by User on 16.03.2017.
 */
public class Massiv_2_String {
    public static void main(String[] args) {
        String[] strings = new String [3];// Создание строчного МАССИВА
        strings [0] = "Привет";
        strings [1] = "Пока";
        strings [2] = "Джава";

        for (int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string:strings){
            System.out.println(string);
        }
        int [] numbers1 = {2,4,6,8,10,32};
        int sum = 0;
        for (int x:numbers1){
            sum=sum+x;
        }
        System.out.println();
        System.out.println("Сумма массива numbers равна "+sum);
    }

}

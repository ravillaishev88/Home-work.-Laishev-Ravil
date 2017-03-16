
/**
 * Created by User on 15.03.2017.
 */
public class Massiv_1 {
    public static void main(String[] args) {
        int number = 11; // примитивный тип данных
        int [] numbers = new int [5]; // Cоздание целочислинного МАССИВА с пустыми ячейками
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i=0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int [] numbers1 = {1,2,3,4,5,6,7,8};// Создание МАССИВА с заданными значениями
        for (int i = 0; i<numbers1.length;i++){
             System.out.println(numbers1[i]);
        }
    }
}

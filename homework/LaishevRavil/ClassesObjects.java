package homework.LaishevRavil;

/**
 * Created by User on 17.03.2017.
 */
public class ClassesObjects {
    public static void main(String[] args) {
        Person person1 = new Person();          // Создание объекта класса
        person1.name = "Иван";
        person1.age = 20;
        System.out.println("Меня зовут "+person1.name+", и мне "+person1.age+" лет");
        Person person2 = new Person();
        person2.name = "Выся";
        person2.age = 23;
        System.out.println("Меня зовут "+person2.name+", и мне "+person2.age+" лет");
    }
}
class Person{                       // У класса могут быть:
    String name;                    // 1. Данные
    int age;                        // 2. Действия, которые он может совершать(МЕТОДЫ)
}

package homework.LaishevRavil;

/**
 * Created by User on 17.03.2017.
 */
public class Methods {
    public static void main(String[] args) {
        Person person1 = new Person();          // Создание объекта класса
        person1.name = "Иван";
        person1.age = 20;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Выся";
        person2.age = 23;
        person2.sayHello();                     // Вызов метода класса
        person2.speak();                        // Вызов метода класса
    }
}
class Person{
    String name;
    int age;

    void speak(){                               // Создание метода класса
        System.out.println("Меня зовут "+name+", и мне "+age+" лет.");
    }
    void sayHello(){                            // Создание метода класса
        System.out.println("Привет");
    }
}

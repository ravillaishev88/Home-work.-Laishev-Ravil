package blockTwoLaishevRavil;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int time = rand.nextInt(28800);
        if(time<3600){
            System.out.println(time);
            System.out.println();
            System.out.println("Осталось менее часа");
        }
        else if(time<7200){
            System.out.println(time);
            System.out.println();
            System.out.println("Остался 1 час");
        }
        else{
            int htime = time/3600;
            System.out.println(time);
            System.out.println();
            System.out.println("Осталось "+htime+" часов");
        }
    }
}

package blockTwoLaishevRavil;
public class Task2_8 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int fib;
        System.out.print(a+" "+b);
        for (int i=0; i<9;i++){
            fib = a+b;
            a=b;
            b=fib;
            System.out.print(" "+fib);
        }
    }
}

package cycles;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a");
        double a = in.nextDouble();;
        System.out.println("Input b");
        double b = in.nextDouble();
        System.out.println("Input h");
        double h = in.nextDouble();
        in.close();
        double y = 0;
        for (double x = a; x < b; x+=h){
            if (x > 2){
                 y = x;
                 System.out.printf("y = %.1f", y);
                 System.out.println();
            }
            else {
                y = -x;
                System.out.printf("y = %.1f", y);
                System.out.println();
            }
        }
    }
}

package branching;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a");
        double a = in.nextDouble();
        System.out.println("Input b");
        double b = in.nextDouble();
        System.out.println("Input c");
        double c = in.nextDouble();
        System.out.println("Input d");
        double d = in.nextDouble();
        in.close();

        double min1 = 0, min2 = 0, max = 0;
        if (a < b){
             min1 = a;
        }
        else if (a > b){
             min1 = b;
        }
        else {
            System.out.println("There is no min and max value");
            return;
        }
        if (c < d){
             min2 = c;
        }
        else if (c > d){
             min2 = d;
        }
        else {
            System.out.println("There is no min and max value");
            return;
        }
        if (min1 < min2){
            max = min2;
            System.out.println("Max value is – " + max);
        }
        else if (min1 > min2) {
            max = min1;
            System.out.println("Max value is – " + max);
        }
        else {
            System.out.println("There is no max value");
        }
    }
}

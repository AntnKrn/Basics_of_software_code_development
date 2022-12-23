package branching;
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextDouble();
        in.close();
        if (x <= 3){
            double y = Math.pow(x,2) - 3 * x + 9;
            System.out.println("F(x)= " + y);
        }
        else {
            double y = 1 / (Math.pow(x,3) + 6);
            System.out.println("F(x)= " + y);
        }
    }
}

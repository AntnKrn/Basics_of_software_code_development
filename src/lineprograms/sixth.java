package lineprograms;
import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextDouble();
        System.out.println("Input y: ");
        double y = in.nextDouble();
        in.close();
        System.out.println(
                (x <= 2 && y <= 4 && x >= -2 && y >= 0)
                || (x <= 4 && x >= -4 && y <= 0 && y >= -3)
        );
    }
}
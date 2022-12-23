package lineprograms;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        double z;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input c: ");
        double c = in.nextDouble();
        z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
        in.close();
    }
}

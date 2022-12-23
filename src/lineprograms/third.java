package lineprograms;
import java.util.Scanner;

public class third {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = Math.toRadians(in.nextDouble());
        System.out.print("Input y: ");
        double y = Math.toRadians(in.nextDouble());
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println(z);
        System.out.println(Math.cos(y));
        System.out.println(Math.sin(x));
        in.close();
    }
}

package lineprograms;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.pow;


public class second {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input c: ");
        double c = in.nextDouble();
        double z = ((b + Math.sqrt(pow(b,2) + 4 * a * c)) / (2 * a)) - (pow(a,3) * c) + pow(b,-2);
        System.out.println(z);
        in.close();

    }
}

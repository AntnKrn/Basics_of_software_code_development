package lineprograms;

import java.util.Scanner;

public class second {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        System.out.print("Input c: ");
        double c = in.nextDouble();
        double z = ((b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / (2 * a)) - (Math.pow(a,3) * c) + Math.pow(b,-2);
        System.out.println(z);
        in.close();

    }
}

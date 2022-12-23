package branching;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A:");
        double A = in.nextDouble();
        System.out.print("Input B:");
        double B = in.nextDouble();
        System.out.println("Input x:");
        double x = in.nextDouble();
        System.out.println("Input y:");
        double y = in.nextDouble();
        System.out.println("Input z:");
        double z = in.nextDouble();
        in.close();
        if (x < A && y < B){
            System.out.println("Will go to");
        }
        else if (x < B && y < A){
            System.out.println("Will go to");
        }
        else if ((z < A && y < B) ){
            System.out.println("Will go to");
        }
        else if ((z < B && y < A) ){
            System.out.println("Will go to");
        }
        else if ((z < A && x < B) ){
            System.out.println("Will go to");
        }
        else if ((z < A && x < A) ){
            System.out.println("Will go to");
        }
        else System.out.println("Won't go to");
    }
}

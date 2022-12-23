package branching;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first angle ");
        double firstAngle = in.nextDouble();
        System.out.println("Input second angle");
        double secondAngle = in.nextDouble();
        in.close();
        if (firstAngle > 0 && secondAngle > 0) {
            if ((firstAngle + secondAngle < 180)) {
                System.out.println("There is triangle");
                if ((firstAngle + secondAngle == 90) || (firstAngle + secondAngle == 135)) {
                    System.out.println("It is right");
                } else {
                    System.out.println("It isn't right");
                }
            } else {
                System.out.println("It isn't triangle");
            }
        } else System.out.println("Input positive values");
    }
}

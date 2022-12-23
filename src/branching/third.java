package branching;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x of A");
        double xA = in.nextDouble();
        System.out.println("Input y of A");
        double yA = in.nextDouble();
        System.out.println("Input x of B");
        double xB = in.nextDouble();
        System.out.println("Input y of B");
        double yB = in.nextDouble();
        System.out.println("Input x of C");
        double xC = in.nextDouble();
        System.out.println("Input y of C");
        double yC = in.nextDouble();
        in.close();
        if (xA / yA == xB / yB && xC / yC == xA / yA && xC / yC == xB /yB){
            System.out.println("All points lie on the same line. ");
        }
        else if ((yA == yB && yB == yC) || (xA == xB && xB == xC)){
            System.out.println("All points lie on the same line. ");
        }
        else System.out.println("There is no such line. ");
    }
}

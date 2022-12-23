package cycles;
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input e: ");
        double e = in.nextDouble();
        System.out.println("Input the number of row members: ");
        int n = in.nextInt();
        double a = 0;
        double sum = 0;
        double roundedA = 0;
        in.close();
        for (int i = 1; i <= n; i++) {
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            roundedA = Math.ceil(a * Math.pow(10,4)) / Math.pow(10,4);
            System.out.print("   " + roundedA);
        }
/*        do{
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            double roundedA = Math.ceil(a * Math.pow(10,4)) / Math.pow(10,4);
            System.out.print("   " + roundedA);
            i++;
        }
        while(i <= n );
        for (i = 1; e <= roundedA; i++){

        }*/
        System.out.println();
        System.out.println(sum);
    }
}

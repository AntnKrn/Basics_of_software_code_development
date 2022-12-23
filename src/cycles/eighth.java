package cycles;

import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstValue = in.nextInt();
        System.out.println("Input the second number: ");
        int secondValue = in.nextInt();
        int nSV = secondValue;
        in.close();
        int nFV = firstValue;
        while (nFV != 0) {
            System.out.println(nFV % 10);
            nFV /= 10;
            while (nSV != 0){
                System.out.println(nSV % 10);
                nSV /= 10;
            }
        }
        System.out.println(firstValue);
    }
}

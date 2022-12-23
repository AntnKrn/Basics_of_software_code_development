package cycles;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = in.nextInt();
        System.out.print("Input n: ");
        int n = in.nextInt();
        for (int i = m; m <= n && i <= n; i++) {
            for (int j = 2; j < i; j++){
                if(i % j == 0 ){
                    System.out.println("The divisor of " + i + " is " + j);
                }
            }
        }
    }
}

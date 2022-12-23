package cycles;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input value: ");
        int n = in.nextInt();
        in.close();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}

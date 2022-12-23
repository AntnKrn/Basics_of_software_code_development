package lineprograms;
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input T: ");
        int T = in.nextInt();
        in.close();
        int hours = T/3600;
        int minuts = (T - 3600 * hours) / 60  ;
        int seconds = (T - 3600 * hours) - (60 * minuts);
        System.out.println(hours + "ч " + minuts + "мин " + seconds + "с");
    }
}

package lineprograms;

import java.util.Scanner;

public class forth {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input R: ");
        double R = in.nextDouble();
        double floorR = Math.floor(R);
        double value = (Math.abs((floorR - R) * 1000)) + R/1000;
        System.out.println(Math.floor(value * 1000)/1000);
        in.close();
    }
}

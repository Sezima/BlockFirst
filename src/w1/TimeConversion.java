package w1;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println("Please enter the current hour in 24-hour format: ");
        System.out.println("Please enter the current minute of the hour: ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        String pmOrAm = hour + ":" + minute;

        System.out.prinf("The time in 12-hour format is: %s AM", pmOrAm);


    }
}

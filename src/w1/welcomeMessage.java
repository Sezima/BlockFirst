package w1;

import java.util.Scanner;

public class welcomeMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String x = sc.nextLine();
        System.out.println("Please enter your dream company:");
        String y = sc.nextLine();
        System.out.printf("Welcome %s to %s!", x, y);



    }
}

package w1;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        System.out.println("Please enter your credit score:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("You need X more points to reach " + a);
    }
}

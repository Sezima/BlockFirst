package w1;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        System.out.println("Enter a three-digit number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 100;
        int d = a / 10;
        int k = d %10;
        int c = a % 10;
        System.out.println(b+k+c);

    }
}

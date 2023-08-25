package w1;

import java.util.Scanner;

public class isdivisibleby5 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 5 == 0){
            System.out.println("The number entered is divisible by: " + a);
        } else {
            System.out.println("The number entered is divisible by: " + a);
        }

    }
}

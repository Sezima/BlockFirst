package w1;

import java.util.Scanner;

public class I_have_a_dream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a double num:");
        double num = sc.nextDouble();
        if (num < 120.5){
            System.out.println("I have a dream");
        }

    }
}

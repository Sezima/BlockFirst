package w1;

import java.util.Scanner;

public class BankCredit {
    public static void main(String[] args) {
        System.out.println("What is your credit score?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 700){
            System.out.println("Congratulations, your credit score is good");
        } else {
            System.out.println("Your credit score needs improvement");
        }

    }
}

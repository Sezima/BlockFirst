package w1;

import java.util.Scanner;

public class offer_from_apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of months actively studied at wedevx.co:");
        int numOfMonths = sc.nextInt();
        if (numOfMonths >= 6){
            System.out.println("Congratulations on your offer from Apple");
        }
    }
}

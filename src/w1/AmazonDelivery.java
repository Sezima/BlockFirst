package w1;

import java.util.Scanner;

public class AmazonDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your payment information (credit/debit/PayPal):");
        String a = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are eligible to make a purchase. Thank you for your business!");

        } else{
            System.out.println("You will be able to make a purchase in X years");
        }

    }
}

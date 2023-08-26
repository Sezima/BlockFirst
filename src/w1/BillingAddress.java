package w1;

import java.util.Scanner;

public class BillingAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your street address:");
        String x = sc.nextLine();
        System.out.println("Please enter city:");
        String y = sc.nextLine();
        System.out.println("Please enter state:");
        String z = sc.nextLine();
        System.out.println("Please enter zipcode:");
        String j = sc.nextLine();
        System.out.printf("Entered Billing Address: %s, %s, %s, %s", x, y, z, j);


    }
}

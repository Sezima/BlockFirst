package w1;

import java.util.Scanner;

public class CreateAnInvoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        int quantity = sc.nextInt();
        double price = sc.nextDouble();

        double total = quantity * price;
        System.out.println("$" + total);
    }
}

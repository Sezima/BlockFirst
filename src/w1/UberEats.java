package w1;

import java.util.Scanner;

public class UberEats {
    public static void main(String[] args) {
        System.out.println("Please enter num of existing items in the cart:");
        System.out.println("Please enter num of newly added items in the cart:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Total items: " + x);
    }
}

package w1;

import java.util.Scanner;

public class DeliveryTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Has the package been delivered? (true/false)");
        boolean answer = sc.nextBoolean();
        if (answer){
            System.out.println("The package has been delivered to its destination.");
        } else {
            System.out.println("The package has not yet been delivered. Please check back later for updates");
        }
    }
}

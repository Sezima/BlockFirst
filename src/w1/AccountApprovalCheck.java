package w1;

import java.util.Scanner;

public class AccountApprovalCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Has your account been approved by an administrator? (true/false)");
        boolean answer = sc.nextBoolean();
        if (answer){
            System.out.println("Congratulations! Your account has been approved and is ready to use.");
        } else {
            System.out.println("Has your account been approved by an administrator? (true/false)\n" +
                    "Sorry, your account has not been approved yet. Please check back later.");
        }
    }
}

package w1;

import java.util.Scanner;

public class HowManyGoals {
    public static void main(String[] args) {
        System.out.println("How many goals did you close today?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Good job on closing X goals today.");
    }
}

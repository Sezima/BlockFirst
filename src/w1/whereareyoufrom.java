package w1;

import java.util.Scanner;

public class whereareyoufrom {
    public static void main(String[] args) {
        System.out.println("Where are you from? ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println("Im lucky to have a friend like you from " + x);
    }
}

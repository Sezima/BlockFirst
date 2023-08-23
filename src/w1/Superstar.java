package w1;

import java.util.Scanner;

public class Superstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an int num:");
        int num = sc.nextInt();
        if (num >= 42){
            System.out.println("Superstar");
        }
    }
}

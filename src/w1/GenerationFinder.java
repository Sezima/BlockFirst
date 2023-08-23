package w1;

import java.util.Scanner;

public class GenerationFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int year = sc.nextInt();
        if (year >= 1946 && year <= 1964){
            System.out.println("You belong to the Baby Boomer generation.");
        } else if (year >= 1965 && year <= 1980) {
            System.out.println("You belong to the Generation X generation");
        } else if (year >= 1981 && year <= 1996) {
            System.out.println("You belong to the Millennial generation.");
        } else if (year >= 1997 && year <= 2012) {
            System.out.println("You belong to the Generation Z generation.");
        } else if (year > 2013) {
            System.out.println(" You belong to the Generation Alpha generation.");
        } else{
            System.out.println("Invalid input.");
        }
    }
}

package w1;

import java.util.Scanner;

public class MakeupLookSuggestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your eye color (blue, green, brown, or hazel):");
        String color = sc.nextLine();
        System.out.println("Enter your hair color (blonde, brown, black, or red):");
        String hair = sc.nextLine();

        if ((color.equals("blue") || color.equals("green")) && (hair.equals("blonde") || hair.equals("brown"))){
            System.out.println("We suggest a natural makeup look");
        } else if ((color.equals("blue") || color.equals("green")) && (hair.equals("black") || hair.equals("red"))) {
            System.out.println("We suggest a bold lip look");
        } else if((color.equals("brown") || color.equals("hazel"))){
            System.out.println("We suggest a smokey eye look");
        } else {
            System.out.println("Sorry, we couldn't identify your eye color or hair color");
        }

    }
}

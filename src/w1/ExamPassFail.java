package w1;

import java.util.Scanner;

public class ExamPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score for exam1:");
        int n1 = sc.nextInt();
        System.out.println("Please enter your score for exam2:");
        int n2 = sc.nextInt();
        System.out.println("Please enter your score for exam3:");
        int n3 = sc.nextInt();
        int x = (n1 + n2 + n3) / 3;

        System.out.println("Your average score is " + x);
        if(x >= 70){
            System.out.println("Congratulations, you passed the exam");
        } else {
            System.out.println("Sorry, you failed the exam");
        }

    }
}

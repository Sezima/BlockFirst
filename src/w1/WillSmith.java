package w1;

import java.util.Scanner;

public class WillSmith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the salary of Will Smith?");
        int willSalary = sc.nextInt();
        System.out.println("What is the salary of Leonardo DiCaprio?");
        int leaonardoSalary = sc.nextInt();
        if (willSalary<leaonardoSalary){
            System.out.println("Leonardo DiCaprio earns more per movie than Will Smith");
        } else {
            System.out.println("Will Smith earns more per movie than Leonardo DiCaprio");
        }
    }
}

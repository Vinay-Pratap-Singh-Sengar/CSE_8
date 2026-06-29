package Lab_3.Conditional_Stmt;

import java.util.Scanner;

public class Eligibility_Of_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible");
        }
        if(age < 18){
            System.out.println("You are not eligible");
        }
    }
}

package Lecture_4;

import java.util.Scanner;

public class Return_Exp {
    public static void lessThan(int a){
        if(a < 0){
            System.out.println("Less than 0");
            return ;
        }
        if(a > 0){
            System.out.println("greater than 0");
            return ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();

        lessThan(a);
    }
}

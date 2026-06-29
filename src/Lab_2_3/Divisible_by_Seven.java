package Lab_2_3;

import java.util.Scanner;

public class Divisible_by_Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        if(n%7 == 0){
            System.out.println("The number is divisible by 7");
        }
        else {
            System.out.println("The number is not divisible by 7");
        }
    }
}

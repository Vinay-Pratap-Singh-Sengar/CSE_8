package Lab_2;

import java.util.Scanner;

public class Swap_No_Third {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();

        System.out.println("Enter the second value");
        int b = sc.nextInt();

        System.out.println("Before swap , the first value is: "+a+ " and the  second value is: "+b);

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After swap , the first value is: "+a+ " and the  second value is: "+b);

    }
}

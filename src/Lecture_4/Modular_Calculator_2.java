package Lecture_4;

import java.util.Scanner;

public class Modular_Calculator_2 {
    public static String add(int a, int b){
        int add = a + b;
        System.out.println("Addition is: " + add);
        return "vinay";
    }

    public static void subtract(int a, int b){
        int sub = a - b;
        System.out.println("Subtraction is: " + sub);
    }

    public static void multiply(int a , int b){

        int mul = a * b;
        System.out.println("Multiplication is: " + mul);
    }

    public static void divide(int a , int b){
        int div = a / b;
        System.out.println("Division is: " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();

        System.out.println(add(x,y));

    }
}

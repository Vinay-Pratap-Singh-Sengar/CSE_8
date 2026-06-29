package Lecture_4;

import java.util.Scanner;

public class Modular_Calculator {

    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("Addition is: " + add);
    }

    public static void subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Subtraction is: " + sub);
    }

    public static void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("Multiplication is: " + mul);
    }

    public static void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int div = a / b;
        System.out.println("Division is: " + div);
    }

    public static void main(String[] args) {
        add();
        add();
        add();
        add();
        add();

        multiply();

    }
}

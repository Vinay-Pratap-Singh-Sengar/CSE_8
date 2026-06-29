package Lab_2;

import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();  // taking string value from user
        System.out.println("Enter your age : ");
        int age = sc.nextInt(); // taking number value from user
        System.out.println("Enter your graduation status : ");
        boolean isGraduated = sc.nextBoolean(); // taking boolean value from user
        System.out.println("Enter your Gender : ");
        char gender = sc.next().charAt(0); // taking character value from
        System.out.println(name);
        System.out.println(age);
        System.out.println(isGraduated);
        System.out.println(gender);
    }
}

package Lab_2;

import java.util.Scanner;

public class ASCII_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);
//        int ascii = (int) ch;
        System.out.println("Ascii value of " + ch + " is : " +(int)ch);
    }
}

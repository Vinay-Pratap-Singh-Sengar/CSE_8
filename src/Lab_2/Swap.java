package Lab_2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int first = sc.nextInt();

        System.out.println("Enter the second value: ");
        int second = sc.nextInt();
        System.out.println("Value of a and b before swap : " + first + "    " +second);

        int temp = second;
        second = first;
        first = temp;
        System.out.println("Value of a and b after swap : " + first + "    " +second);
    }
}

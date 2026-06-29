package Lab_2_3;

import java.util.Scanner;

public class NoteDenomination {
    public static void noteDenomination(int amount){
        if(amount >= 500 ){
            int count = amount / 500;
            System.out.println("total number of 500 notes is : " +count);
            amount = amount % 500;
        }
        if(amount >= 200 ){
            int count = amount / 200;
            System.out.println("total number of 200 notes is : " +count);
            amount = amount % 200;
        }
        if(amount >= 100 ){
            int count = amount / 100;
            System.out.println("total number of 100 notes is : " +count);
            amount = amount % 100;
        }
        if(amount >= 50 ){
            int count = amount / 50;
            System.out.println("total number of 50 notes is : " +count);
            amount = amount % 50;
        }
        if(amount >= 20 ){
            int count = amount / 20;
            System.out.println("total number of 20 notes is : " +count);
            amount = amount % 20;
        }
        if(amount >= 10 ){
            int count = amount / 10;
            System.out.println("total number of 10 notes is : " +count);
            amount = amount % 10;
        }
        if(amount >= 5 ){
            int count = amount / 5;
            System.out.println("total number of 5 notes is : " +count);
            amount = amount % 5;
        }
        if(amount >= 2 ){
            int count = amount / 2;
            System.out.println("total number of 2 notes is : " +count);
            amount = amount % 2;
        }
        if(amount >= 1 ){
            int count = amount / 1;
            System.out.println("total number of 1 notes is : " +count);
            amount = amount % 1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amount = sc.nextInt();

        noteDenomination(amount);
    }
}

package Lab_2;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle : ");
        int principle = sc.nextInt();

        System.out.println("Enter the rate : ");
        int rate = sc.nextInt();

        System.out.println("Enter the time : ");
        int time = sc.nextInt();

//        double si = principle * rate * time / 100.0;
//        typecasting : explicit
        double si = (double) principle * rate * time / 100;
        System.out.println("Interest rate is : " +si);
    }
}


//wap to take input from the user and find out the simple interest where p = 8000 , r = 5% and t = 2
package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        int minNumber = 2147483647;      //any user entered number will be less than 2147483647

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if ( num < minNumber){      // if the user entered number is less than current minimum number
                minNumber = num;
            }
        }
        System.out.println("minNumber = " + minNumber);

        scan.close();


    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the minimum number
 */
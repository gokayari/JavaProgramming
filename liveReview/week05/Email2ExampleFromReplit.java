package week05;

import java.util.Scanner;

public class Email2ExampleFromReplit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email: "); //craig_federighi@apple.com

        String email = input.next();

        int indexof_ = email.indexOf("_");
        int indexofAtSign = email.indexOf("@");
        int indexofDot = email.indexOf(".");

        String firstName = email.substring(0, indexof_);
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName); //=Craig

        String lastName = email.substring(indexof_ +1, indexofAtSign);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);   //=Federighi

        String lastNameAlternativeWay = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        System.out.println("lastNameAlternativeWay = " + lastNameAlternativeWay);

        String domain = email.substring(indexofAtSign +1, indexofDot);
        System.out.println("domain = " + domain);   //=apple



    }
}
/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com

Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
package week05;

import java.util.Scanner;

public class EmailCheck__Interview {      //Interview***

    public static void main(String[] args) {

        /*
        indexof("@")<1 : 0 (no character before @ sign) or -1 (there is no @ sign)
        indexof("@") >= email.length()-3   >>>false (a@a.a : index of("@") : length()-4 )
                                           >>> Must be at least 3 characters after '@'
        what if we have 2 @ signs:
        the index of @ sign == last index of @ sign : there is one @ sign

        DOT conditions
        indexof(".")<1 : 0 (no character before dot sign) or -1 (there is no dot sign)
        indexofDotSign == email.length()-1 : problem
        the index of @ sign > bigger than indexofDotSign : problem
        the index of @ sign +1 == indexOfDotSign (@.) there is no character between "@" and "." : problem
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email: ");

        String email = input.next();

        boolean result = true;

        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");      //it can be more "." before "@" because >> lastIndexOf

        if(atSignIndex < 1
                || atSignIndex >= email.length() -3              //a@a.a >> length:5 >> 5-3=2 >> atSignIndex >=2 >>false
                || atSignIndex != email.lastIndexOf("@")){   //there is not one @ sign
            result = false;
        }
        if ( dotIndex < 1
                || dotIndex == email.length() -1            //checking "." is last character?
                || atSignIndex > dotIndex                   // @ sign must be before than "." sign
                || atSignIndex +1 == dotIndex ){            // there must not be a "." immediately after the @ sign
            result = false;
        }
        System.out.println(result);






    input.close();
    }
}
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */
package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); //"Java"

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);   // 0 is index number of firstName
        char l = lastName.charAt(0);    // 0 is index number of lastName

        // String initial = f + l; >>>it is wrong because>> Char + Char = Char >>therefore error
        String initial = f + "." + l;    // char + String + char = String >> it is correct

        System.out.println("initial = " + initial);


        scan.close();









    }
}

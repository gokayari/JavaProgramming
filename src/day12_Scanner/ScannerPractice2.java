package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter true or false:");
        boolean result = input.nextBoolean();   //only "true" or "false" keywords

        //-------------------------------------

        System.out.println("Enter your name:");
        String name = input.next(); //reads the input until a space >> write "Java Programming"

        System.out.println("name = " + name); // >> prints only "Java"



        input.close();

    }
}

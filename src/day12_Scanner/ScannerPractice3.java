package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //"Wooden Spoon"Enter

        System.out.println("Enter your Programming Language:");
        String programmingLanguage = input.nextLine();  //"Java Programming Language"Enter

        System.out.println("Enter your age:");
        int age = input.nextInt();  //24
        input.nextLine();   //Enter     //captures the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine(); //"CYDEO School"Enter

        System.out.println("Enter your school number:");
        int number = input.nextInt();  //5
        input.nextLine();   //Enter

        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        System.out.println("number = " + number);


        input.close();

    }
}

package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Enter (2)

        System.out.println("Enter your age");
        int age = input.nextInt();  //19    //it ignores "Enter" key (1) "Enter" is going to Scanner

        //input.nextLine(); // you should write this

        System.out.println("Enter your full name");
        String fullName = input.nextLine(); //"Enter" will come here automatically from Scanner (3), therefore you can not write fullName

        System.out.println("Enter your GPA");
        double gpa = input.nextDouble();    //3.5   //it skips to this line(4)
        input.nextLine();   //Enter



        System.out.println("age = " + age); // 19
        System.out.println("fullName = " + fullName);   //(Empty)
        System.out.println("gpa = " + gpa); // 3.5

        input.close();
    }
}
/*
1. Ask the user to enter age (nextInt())
2. Ask the user to enter full name (nextLine())
 */
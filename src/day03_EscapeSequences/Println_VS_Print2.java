package day03_EscapeSequences;

public class Println_VS_Print2 {

    public static void main(String[] args) {

        System.out.println("Knock Knock"); //first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("------------------");

        System.out.print("Knock Knock"); //prints Knock Knock, does not append new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("------------------");

        System.out.println("Hello everyone, how are you all today? Who is this? This is Java");
        System.out.println("------------------");

        System.out.print("Hello everyone, ");
        System.out.print("how are you all today? ");
        System.out.print("Who is this? This is Java");

        System.out.println();


    }
}

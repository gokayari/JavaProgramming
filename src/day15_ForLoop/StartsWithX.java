package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("Enter a word:");


        String word = new Scanner(System.in).next();//since we are not giving the variable multiple times, so we can use the String variable instead of the Scanner variable
                                    // We do not need Scanners variable. It is Object of Scanner

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a");
        }
        System.out.println("word = " + word);
    }
}
/*
Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */

package day15_ForLoop;

import day11_Switch_Scanner.ScannerIntro;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        System.out.println("Enter a word:");

        String word2 = new Scanner(System.in).next();

        String result = word2.replace("x", "a").replace("X", "a");

        System.out.println("result = " + result);



        //We do not have close, because we use at 13. line String variable, not Scanner
    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */
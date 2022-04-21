package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void method1() throws FileNotFoundException {

        new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException {

        method1();

    }

    public static void method3(){

        //method2();

        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method4(){

        method3();
    }

}

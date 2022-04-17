package week09;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(add(5.2, 3.5));  //8.7

        double sum = add(4, 5);     //9.0   //integer, and compiler did not complain
        // int sum = add(4, 5);     //error
        int sum1 = (int)add(4, 5);  //9

/*
Datatype parameter promotion
byte -> short -> int -> long -> double
 */

        System.out.println("=====");

        System.out.println("100*2 =" + multiply(100,2));

    }

    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }
}

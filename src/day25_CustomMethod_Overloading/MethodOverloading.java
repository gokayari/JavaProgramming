package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,-4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5 };
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);             //"sort method" is a kind of multiple method
                                            //one method(exmp:sort) instead of many methods

        System.out.println("--------------------------------");

        sumOfNumbers(10, 20);   //same method name, but first method from below

        sumOfNumbers(10,20,30);     //same method name, but second method from below

        sumOfNumbers(10.0, 20.5, 30.0, 40.5);      //same method name, but third method from below
        // same method name, (must be!) different parameters >>> it is Overloading


        //sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);

        //sum of 10, 20, 30
        int sum2 = sumOfNumbers(10,20,30);

        //sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10,20,30,40);

        //sum of 4.5, 5.5, 6.5, 7.5
        double sum4 = sumOfNumbers(4.5, 5.5, 6.5, 7.5);

    }

    public static int sumOfNumbers (int num1, int num2){
        return num1+num2;
    }

    public static int sumOfNumbers (int num1, int num2, int num3){
        return num1+num2+num3;
        //return sumOfNumbers(num1, num2) + num3;   //we can also use this method in another method
    }

    public static int sumOfNumbers (int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

    public static double sumOfNumbers (double num1, double num2, double num3, double num4){
        return num1+num2+num3+num4;
    }



}

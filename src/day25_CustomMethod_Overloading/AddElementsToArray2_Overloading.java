package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray2_Overloading {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        arr = addElement(arr, 5);

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addElement(arr2, 5.5);

        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"};
        names = addElement(names, "Neira");

        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addElement(chars, 'X');

        //all of them are same method>>> "addElement", it is method overloading


    }
    //1. create a return method called addInteger that can add an Integer after the last index of an integer array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;     //i=0,1,2,3
        }

        result[i] = element;        //here i=4, because we used post-increment

        //result[result.length -1] = element;   //opt2

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;
        //result[result.length -1] = element;   //opt2

        return result;
    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        //result[result.length -1] = element;   //opt2

        return result;
    }


    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element){

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;        //element need to be assigned to the last index
        //result[result.length -1] = element;   //opt2
        return result;
    }

}

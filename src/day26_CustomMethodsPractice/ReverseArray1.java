package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] reverseArr = reverse(arr);
        System.out.println(Arrays.toString(reverseArr));    //{5,4,3,2,1}

        System.out.println("------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        double[] reverseArr2 = reverse(arr2);
        System.out.println(Arrays.toString(reverseArr2));

        System.out.println("-------------------");

        char[] arr3 = {'a', 'b', 'c'};

        char[] reverseArr3 = reverse(arr3);
        System.out.println(Arrays.toString(reverseArr3));

        System.out.println("------------------");

        String[] arr4 = {"One", "Two", "Three"};

        String[] reverseArr4 = reverse(arr4);
        System.out.println(Arrays.toString(reverseArr4));

    }

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
}

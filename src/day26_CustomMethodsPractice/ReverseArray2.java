package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int[] arrReverse = reverse1(arr);
        System.out.println(Arrays.toString(arrReverse));    //{50,40,30,20,10}
    }

    public static int[] reverse1(int[] array){

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }
}

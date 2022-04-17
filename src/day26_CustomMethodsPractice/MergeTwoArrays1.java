package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays1 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7,8};

        int[] arr = merge(nums1, nums2);    //{1,2,3,4,5,6,7,8}

        System.out.println(Arrays.toString(arr));

        System.out.println("===============");

        String[] words1 = {"Java", "Python", "Cydeo"};
        String[] words2 = {"Ahmet", "Ali", "Ayse"};

        String[] arr2 = merge(words1,words2);       //{"Java", "Python", "Cydeo", "Ahmet", "Ali", "Ayse"}
        System.out.println(Arrays.toString(arr2));
    }
    //merge the given two arrays and returns new array
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = new double[arr1.length + arr2.length];

        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = new char[arr1.length + arr2.length];

        int i = 0;

        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = new String[arr1.length + arr2.length];

        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }

}

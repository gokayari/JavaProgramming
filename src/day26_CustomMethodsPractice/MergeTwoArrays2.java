package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9};

        int[] arr = merge(nums1, nums2);    //{1,2,3,4,5,6,7,8,9}

        System.out.println(Arrays.toString(arr));
    }

    //merge the given two arrays and returns new array
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
}

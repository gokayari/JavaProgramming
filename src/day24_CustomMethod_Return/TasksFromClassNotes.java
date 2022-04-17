package day24_CustomMethod_Return;

import java.util.Arrays;

public class TasksFromClassNotes {

    public static void main(String[] args) {

        //2:
        maxNumber(15,25,95,40);     //max:95

        //3:
        minNumber(15,25,95,40);     //min:15

        //3:(better)
        int[] nums4 = {15,25,95,40};
        System.out.println(minNumber1(nums4));  //15

        //4:
        reverse(1,2,3,4,5);         //{5,4,3,2,1}

        //4(better):
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse1(nums)));

        //5:
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5};
        System.out.println(Arrays.toString(mergeArrays(nums1,nums2)));  //{1,2,3,4,5}


    }



    //my solutions
    //2. create a method that can return the maximum number from an array of integers
    public static void maxNumber(int n1, int n2, int n3, int n4){
        int [] numbers = {n1,n2,n3,n4};
        int maxNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }

        System.out.println("maxNum = " + maxNum);
    }


    //3. create a method that can return the minimum number from an array of integers
    public static void minNumber(int n1, int n2, int n3, int n4){
        int [] numbers = {n1,n2,n3,n4};
        int minNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum){
                minNum = numbers[i];
            }
        }

        System.out.println("minNum = " + minNum);
    }
    //better solution:
    public static int minNumber1(int[] arr){
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minNum){
                minNum=arr[i];
            }
        }
        return minNum;
    }


    //4. create a method that return the reversed array
    //					{1,2,3,4,5} === > {5,4,3,2,1}
    public static void reverse(int n1, int n2, int n3, int n4, int n5){
        int[] numbers = {n1,n2,n3,n4,n5};
        int [] reversed = new int[numbers.length];

        for (int i = 0, j = numbers.length-1 ; i <= numbers.length-1; i++,j--){
            reversed[i] = numbers[j];
        }
        System.out.println(Arrays.toString(reversed));
    }
    //better solution:
    public static int[] reverse1(int[]arr){
        int[] reversedArr = new int[arr.length];
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            reversedArr[i] = arr[j];
        }
        return reversedArr;
    }


    //5.5. create a method that can merge two arrays and return the new array
    //				arr1 = {1,2,3}
    //				arr2 = {4,5}
    //				{1,2,3,4,5}
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int [] newArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[i+ arr1.length] = arr2[i];
        }
        return newArray;
    }

}

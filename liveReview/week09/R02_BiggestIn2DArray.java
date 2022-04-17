package week09;

import java.util.Arrays;

public class R02_BiggestIn2DArray {

    public static void main(String[] args) {

        // fond the biggest number in each array and store it to another one dimensional array
        int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} };

        //I want to print this 2D array at the console

        System.out.println(Arrays.deepToString(arr));   //[[3, 12, 3, 34, 12], [13...],[]]

        int[] biggestNumbers = new int[arr.length];
                        // arr.length the size of 2D array

        for (int i = 0; i < arr.length; i++) {

            int max = arr[i][0];    //this statement means first element of each at index i
            //for each one single dimen array I need to have a separate max assumption

            for (int each : arr[i]) {   //check each character in a 1D array

                if (each > max){
                    max = each;
                }
            }
            biggestNumbers[i] = max;

        }

        System.out.println(Arrays.toString(biggestNumbers));    //{34, 456, -2}



    }
}

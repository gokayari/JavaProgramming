package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray__Interview {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80};
        //                 0   1   2   3   4   5   6   7

        int [] reversed = new int[numbers.length];      //to make sure that the array has enough capacity to contain all the elements first array

/*
                j                   i
        reversed[0] = numbers[numbers.length-1];   //last character of numbers
        reversed[1] = numbers[numbers.length-2];   //6th character
        reversed[2] = numbers[5];                  //5th character
            ...
        reversed[7] = numbers[0]                   //first character
*/

        for (int i = numbers.length -1, j=0 ; i >=0 ; i--, j++) {   //shortcut: numbers.forr:
            reversed[j] = numbers[i];
        }


        System.out.println(Arrays.toString(reversed));



    }
}

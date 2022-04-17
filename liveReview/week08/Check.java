package week08;

import java.util.Arrays;

public class Check {

    public static void main(String[] args) {

        /*
     [0, 0, 0, 0, ..............]
     word = acc;
     [ 1, 0, 2, 0 , 0 ...... ]
     ASCII
     'a' = 97
     'b' = 98
     countOfEachChar['a'-97] =  countOfEachChar['a'-97] + 1;

      */

        int [] countOfEachChar = new int[26];

        String word = "listen";

        for ( char each : word.toCharArray()){
            countOfEachChar[each-97] = countOfEachChar[each-97] +1;
            System.out.println(Arrays.toString(countOfEachChar));
        }

    }
}

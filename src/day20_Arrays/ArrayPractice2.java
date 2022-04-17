package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        ....
        */

        //way1:
        /*
        for (char i = 'A', j =0; i <= 'Z' && j < letters.length ; i++, j++) {    //multiple
            letters[j]= i;
        }
        */

        //way2: (similar to way1)
        /*
        for (int i = 'A', j =0; i <= 'Z' && j < letters.length ; i++, j++) {    //multiple

            letters[j]= (char)i;
        }
        */


        //easier way:
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {      //or:...;i++,ch++){
            letters[i] = ch++;          //=ch
        }                               //ch++

        System.out.println(Arrays.toString(letters));   //[A∼Z]


        System.out.println("-----------------------------------");

        char[] letters2 = new char[26];     //[Z∼A]

        char ch2= 'Z';
        for (int i = 0; i < letters.length; i++) {
            letters2[i] = ch2;
            ch2--;
        }
        System.out.println(Arrays.toString(letters2));



    }
}

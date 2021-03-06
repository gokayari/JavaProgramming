package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26];    //Z∼A

        /*        i     ch
        alphabets[0] = 'Z';     //90 from ASCII Table
        alphabets[1] = 'Y';     //89
        alphabets[2] = 'X';     //88
        ...
        */

        System.out.println(alphabets);  //ZYX    ... >>>it is not Array, it prints elements

        System.out.println(Arrays.toString(alphabets));     //prints the whole array
        System.out.println(alphabets[0]);       //printing the element of array


        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }
        System.out.println(Arrays.toString(alphabets));
    }
}

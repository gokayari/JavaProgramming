package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        //Arrays.copyOf():

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 5);   //length!

        System.out.println(Arrays.toString(earlyBirds));


        System.out.println("------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //numbers [] = Arrays.copyOf(numbers, 5);   >>>is NOT correct!

        numbers = Arrays.copyOf(numbers, 5);    //{1,2,3,4,5}
        System.out.println(Arrays.toString(numbers));


        System.out.println("-----------------------------");

        //Arrays.copyOfRange( , , ):

        char [] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};    //index numbers!
        char [] ch2 = Arrays.copyOfRange(ch1, 2, 6);        //similar to substring() method

        System.out.println(Arrays.toString(ch2)); //indexes: (2,3,4,5) = {'C','D','E','F'}


        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //index:        0  1  2  3  4  5  6  7  8   9

        int[] result = Arrays.copyOfRange(scores,3,7);  //40,50,60,70

        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores,5,scores.length); //from 5 till end
        System.out.println(Arrays.toString(result2));





    }
}

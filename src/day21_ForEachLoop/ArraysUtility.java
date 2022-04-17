package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        //Arrays.sort():

        int[] nums = {1,2,3,4,5};

        System.out.println(nums);   //hashcode

        System.out.println(Arrays.toString(nums));      //[1, 2, 3, 4, 5]

        System.out.println(nums[0]);    //1

/*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
*/

        System.out.println("-----------------------");

        int[] scores = {95, 100, 55, 65, 85, 78};
        System.out.println( Arrays.toString(scores));

        //scores = Arrays.sort(scores); >>>is NOT correct!
        Arrays.sort(scores);
        System.out.println( Arrays.toString(scores));

        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Score: " + scores[scores.length -1]);


        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        String[] words = {"anna", "ANNA", "Anna"};      //'a'>'A'
        Arrays.sort(words);                             //a∼z (97), A∼Z (65)
        System.out.println(Arrays.toString(words));


        System.out.println("-----------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);  //false

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);  //true



        System.out.println("------------------");
        //"acb", "bac"

        char[] ch1 = {'a','b','c'};
        char[] ch2 = {'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println(anagram);





    }
}

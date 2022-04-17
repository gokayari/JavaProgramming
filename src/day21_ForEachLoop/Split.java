package day21_ForEachLoop;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {

        //split():

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");   //{"Wooden", "Spoon"}
        System.out.println(Arrays.toString(words));


        System.out.println("----------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));   ////{"WoodenSpoon", "cydeo.com"}


        System.out.println("----------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences = s.split("\\. ");   //<< we must use "\" for special characters
        System.out.println(Arrays.toString(sentences));

    }
}

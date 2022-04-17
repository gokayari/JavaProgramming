package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        //charAt():

        String word = "Cydeo";

        char thirdChar = word.charAt(2);    //index: 01234 >> 2 is third character

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);
        */

        System.out.println("-----------------------------------");

        //length():

        String s1 = "Batch 25 is the best batch.";  //27 characters

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);   //=27

        char lastChar = s1.charAt(s1.length() - 1);
        System.out.println("lastChar = " + lastChar);   //'.'

        System.out.println("-----------------------------------");

        //toUpperCase() & toLowerCase():

        String str = "wooden spoon";

        str = str.toUpperCase();    //"WOODEN SPOON"
        System.out.println(str);

        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println("sentence = " + sentence);




    }
}

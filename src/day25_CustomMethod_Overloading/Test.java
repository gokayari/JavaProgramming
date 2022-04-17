package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);


        System.out.println("-----------------");

        String s1 = "Wooden Spoon";

        String reversed = StringUtility.reverse(s1);

        System.out.println(reversed);


        System.out.println("--------------");

        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("How many palindrome words are in \"names\" Array: " + count);


        System.out.println("-----------------");

        String name = "ggggggöööööööökkkaaaaaaaaayyyy";

        System.out.println(StringUtility.removeDuplicates(name));

    }
}

package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram__Interview {

    public static void main(String[] args) {

        //Arrays.equals(ch1,ch2):

        String str1 = "acdb";
        String str2 = "dbca";

        //write program that can check if str1 & str2 are build out same characters

        //String class does not have sort method!

        char[] ch1 = str1.toCharArray();    //{a,c,d,b}
        char[] ch2 = str2.toCharArray();    //{d,b,c,a}

        Arrays.sort(ch1);           //{a,b,c,d}
        Arrays.sort(ch2);           //{a,b,c,d}

        boolean anagram = Arrays.equals(ch1,ch2);

        if (anagram){
            System.out.println("Anagram");
        }else{
            System.out.println("not Anagram");
        }



    }
}
/*
Anagram for String class:

Scanner input = new Scanner(System.in);

        System.out.println("Enter first string:");
        String word1 = input.next().toLowerCase();
        System.out.println("Enter second string:");
        String word2 = input.next().toLowerCase();

        boolean isAnagram = true;

        if (word1.length() == word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                String temp = word1.charAt(i) + "";
                word2 = word2.replaceFirst(temp, "");
            }
            if (!word2.isEmpty()){
                isAnagram = false;
            }
        }else{
            isAnagram = false;
        }

        System.out.println("isAnagram = " + isAnagram);

        input.close();
 */
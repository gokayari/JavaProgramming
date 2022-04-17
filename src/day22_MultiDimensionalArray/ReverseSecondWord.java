package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {        //Interview Question

    public static void main(String[] args) {
        
        String sentence = "I Love Java";
        
        String[] words = sentence.split(" ");
        
        String reverse = "";    //evoL

        for (int i = words[1].length()-1; i >=0; i--) {     //words[1]: "Love"
            reverse += words[1].charAt(i);
        }
        System.out.println(reverse); //= evoL

        //first way:
        sentence = sentence.replaceFirst(words[1], reverse );       //I evoL Java
        System.out.println(sentence);

        //second way:
        words[1] = reverse;
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            System.out.print(word + " ");         //I evoL Java
        }



    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */
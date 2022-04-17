package day19_LoopPractices;

public class FrequencyOfCharacters {    //Interview Question!

    public static void main(String[] args) {
        
        String str = "aabcccd";
        String result = "";     //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {    //each character from string

            char ch = str.charAt(j);    //j=0 >>> 'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {    //to find the frequency of each character

                char each = str.charAt(i);  //each character of str
                if (ch == each){
                    count ++;
                }
            }

            if (result.contains(""+ ch)){   //check the character before result
                continue;                   //btw contains method is for String, not for char
            }

            result += ch;
            result += count;

        }
        System.out.println(result);



//Step 1: how to find frequency of first character:
        /*
            char ch = str.charAt(0);        //'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if(ch == each){
                    count++;
                }
            }
            System.out.println(count);
            */
//Step 2: to find frequency of each character from string:
        /*
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (ch == each){
                    count ++;
                }
            }
         */
//Step 3: to make result:(in the outer loop)
        /*
            result += ch;
            result += count;
         */
//Step 4: In order for the result not to repeat the characters in the form of a2a2b1c3c3c3d1,
//          and to skip the operations (result += ch; result += count;) when the same character comes
        /*
        if (result.contains(""+ ch)){
                continue;
            }

            result += ch;
            result += count;
         */


    }
}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
package week05;

import java.util.Locale;

public class StringReview02 {

    public static void main(String[] args) {

        /*

        length() : it does not take parameter, it returns an integer number
        charAt
        toUpperCase
        toLowerCase
        trim
        indexOf
        lastIndexOf
        replace
        replaceFirst
        substring
        repeat

        */

        String message = "EU08 is Awesome!!";
        int count = message.length();
        System.out.println("How many characters we have: " + count);

        if(message.length()==17){
            System.out.println("happy testing");
        }


        System.out.println(message.toUpperCase());  //EU08 İS AWESOME!!


        String str2 = "  abc def  ";
        str2 = str2.replace(" ", "");   //abcdef
        System.out.println(str2);


        String str3 = " EU8 Awesome ";
        str3 = str3.trim().replaceFirst(" ", "");   //EU8Awesome
        System.out.println(str3);

        String str4 = str3.trim().replaceFirst(" ", "").toUpperCase().substring(3);
        //AWESOME
        System.out.println(str4);












    }
}

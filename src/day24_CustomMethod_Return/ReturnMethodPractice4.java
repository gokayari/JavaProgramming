package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {        //look also day01-Test

    public static void main(String[] args) {


        String str = "ccccccccddddddaaaabbbbb";
        str = removeDuplicates(str);

        System.out.println(str);

        System.out.println("---------------------");

    }


    //1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicates(String str1){      //"aaabbcccc" ===> "abc"

        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            char each = str1.charAt(i);

            if (!result.contains(""+each)){
                result += each;
            }
        }

        return result;
    }

    
}

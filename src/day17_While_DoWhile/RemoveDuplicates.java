package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBBCC";

        String result = ""; //A

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+ str.charAt(i);  //*
            if(result.contains(ch)){    // if the result already contains this character
                continue;   //skips
            }
            result += ch;
        }
        System.out.println(result);     //ABC

    }
}
/*
char ch = str.charAt(i);
            if(result.contains("" + ch)){
 */ //this is also correct because contains method is just for String
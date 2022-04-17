package week05;

public class ReverseUsingCharAtMethod {

    public static void main(String[] args) {

        //what is palindrome?   "madam" when you reverse: "madam" again ||  KAYAK is palindrome
        //noon : palindrome PIQ (popular Interview question) for JAVA
        // check for 5 characters word, and without methods that we did not learn

        String word = "madam";

        /*
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.charAt(word.length()-2));
        */

        String reversedWord = "";
        reversedWord += word.charAt(4);
        reversedWord += word.charAt(3);
        reversedWord += word.charAt(2);
        reversedWord += word.charAt(1);
        reversedWord += word.charAt(0);

        if(word.equals(reversedWord)){
            System.out.println("The word is Palindrome");
        }else{
            System.out.println("The word is NOT Palindrome");
        }







    }
}

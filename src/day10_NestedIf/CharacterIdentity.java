package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '@';

        if( ch >= '0' && ch <= '9'){    // for digit
            System.out.println("Digit");
        }else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){ //for Alphabet
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special character");
        }

        //with their values in the ASCII table:
        /*
        if( ch >= 48 && ch <= 57){    // for digit
            System.out.println("Digit");
        }else if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){ //for Alphabet
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special character");
        }
         */


    }
}

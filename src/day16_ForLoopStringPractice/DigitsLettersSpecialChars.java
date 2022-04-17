package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#) $ (%WoodenSpoon";

        String digits = "";     //12345
        String letters = "";    //CydeoWoodenSpoon
        String specialChars = "";   //!@#$%

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                letters += ch;
            }else if ( ch >= '0' && ch <= '9'){
                digits += ch;
            }else{
                if (ch != ' ') {
                    specialChars += ch;     //if the special character is not a space
                }
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
        
    }
}

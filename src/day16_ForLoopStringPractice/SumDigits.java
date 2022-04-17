package day16_ForLoopStringPractice;

public class SumDigits {

    public static void main(String[] args) {

        String str = "A1B2C3";

        int digits = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch -48;
            }
        }
        System.out.println(digits);




    }
}
/*
Write a program that can return the sum of digits from a string
Ex:
input: "A1B2C3"
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */
package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index:      01234..11

        String result = ""; //contain the reverse version of str
        //noopS nedooW

        /*
        result += str.charAt(11)    //:last character "n"
        result += str.charAt(str.length()-1);   //:last character 12-1=11 "n"
        result += str.charAt(10);  //: "o"
        result += str.charAt(9);   //: "o"
        result += str.charAt(8);   //: "p"
        result += str.charAt(7);   //: "S"
        .
        .
        result += str.charAt(0);   //: "W"
        result += str.charAt(str.length()-12);   //: "W"
        */

        //Second way: (I found)
        for (int i = 1; i <= str.length(); i++) {
            result += str.charAt(str.length()-i);
        }
        System.out.println(result);

        //First way: (better)
        String result1 = "";

        for (int i = str.length()-1; i >= 0 ; i--) {    //i: index numbers of str (starting last index to index 0)
            result1 += str.charAt(i);
        }
        System.out.println(result1);

    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
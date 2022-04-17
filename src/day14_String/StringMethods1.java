package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        //trim():

        String str1 = "     batch 25       ";
        str1 = str1.trim();    //"batch 25" // returns new String without the white (unnecessary/unused) spaces before and after the text

        System.out.println(str1);


        //indexOf() & lastIndexOf():

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");     //8     //in order to find "h"
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");   //9 //>>> on order to find second "o" of str2
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language";

        int n3 = str3.indexOf("amm");    //3 //in order to find third "a"
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g"); //23    //>>> in order to find LAST character, for ex:"g"
        System.out.println("n5 = " + n5);

        System.out.println("----------------------------------");

        String s = "Java Nova Cava Wawa Orange";

        int firstA = s.indexOf("a");        //FIRST a
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");     //LAST a
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");        //SECOND a
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");          //THIRD a
        System.out.println("thirdA = " + thirdA);

        int fourthA = s.indexOf("ava W");     //FOURTH a
        // or // int fourthA = s.lastIndexOf("av");
        // or // int fourthA = s.indexOf("Ca") + 1;
        System.out.println("fourthA = " + fourthA);

        int fifthA = s.lastIndexOf("a W");      //The lastIndexOf method is easier because it is close to the end
        System.out.println("fifthA = " + fifthA);

        int sixthA = s.lastIndexOf("aw");       //The lastIndexOf method is easier because it is close to the end
        int seventhA = s.lastIndexOf("a ");     //lastIndexOf method is easier  //it is similar to line 46, but it is lastIndexOf method!


    }
}

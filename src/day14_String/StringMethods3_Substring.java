package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //substring(beginning index, ending index):

        String word = "Cydeo School";
        //             012345...
        String brand = word.substring(0, 4+1);    //0:C 1:y 2:d 3:e 4:o 5:
        //*if brand is ending in 4, it is not written 4! we have to write next index number.
        //**it means until 4! so without 4, therefore have to been (0, 5)
        System.out.println("brand = " + brand); //Cydeo

        String brand2 = word.substring(6);  //we do not have to write last index number
        System.out.println("brand2 = " + brand2);   //School


        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" "));                         //Java
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));     //Programming
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);                   //Language

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        /*  //Manual way: (But the first way is more logical and reusable)
        String s1 = word2.substring(0, 4);      //Java
        String s2 = word2.substring(5, 16);     //Programming
        String s3 = word2.substring(17);        //Language

         */


    }
}

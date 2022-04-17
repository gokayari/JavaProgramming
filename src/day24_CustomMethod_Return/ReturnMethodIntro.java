package day24_CustomMethod_Return;

public class ReturnMethodIntro {        //look also day01-Test

    public static void main(String[] args) {

        String str = "Java";

        String result = reverse(str);    //>>> it is value, you can not use for void method

        System.out.println(result);     //"avaJ"


        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }


        //reverse("Java");  //if you want to use with void method
    }


    public static String reverse(String str){     //"Java"

        String reverse = "";

        for (int i = str.length()-1 ; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;

    }


}

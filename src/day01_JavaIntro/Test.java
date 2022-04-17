package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaabbbbbbbbbb";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        System.out.println("---------------");

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);






    }
}

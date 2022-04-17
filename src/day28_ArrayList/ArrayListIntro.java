package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        //ArrayList<Integer> numbers = new ArrayList<>();   //it is also correct, specifying second DataType is optional

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<>();


        System.out.println(numbers.toString()); // you do don't have to use "toString" method
        System.out.println(numbers);
        System.out.println(names);



    }
}

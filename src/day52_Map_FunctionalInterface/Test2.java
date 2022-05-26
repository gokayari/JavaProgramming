package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;

        printEach = s -> {          //we can not use () parentheses
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden Spoon");


        MySecondFunctionalInterface<Integer> cube;

        cube = n -> System.out.println( n * n * n); //we do not have to use {} parentheses, if we have one condition

        cube.test(5);



    }
}

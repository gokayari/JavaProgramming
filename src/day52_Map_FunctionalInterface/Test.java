package day52_Map_FunctionalInterface;

//lambda: () -> {}

public class Test {

    public static void main(String[] args) {

        //function1: create a function that can display a number is odd
        MyFirstFunctionalInterface  oddOrEvenNumber =  (n) -> {
            if(n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);


        //function2: crate a function that can check if a person is eligible


        //function3: create a function that can display the cube of number
    }
}

package day15_ForLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        /*
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        .
        .
        .
        It is hard to write 100 times
        */

        // for (Initialization, condition, Iteration)

        for (int i = 1 ; i <= 100; i++){     //it writes "Hello World" 100 times
            System.out.println("Hello World!");
        }
        //or :(int i = 1 ; i <= 100; ++i)   //it does not matter pre or post-increment
        //or :(int i = 1 ; i <= 100; i += 1)

    }
}

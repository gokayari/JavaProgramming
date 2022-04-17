package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        //20 times Wooden Spoon:
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("-------------------------------");
        // Nested Loop:(20 times Wooden Spoon)

        for (int j = 0; j < 4; j++) {   // j:0, 1, 2, 3

            for (int i = 0; i < 5; i++) {   // i: 0, 1, 2, 3, 4
                System.out.println("Wooden Spoon");
            }
        }
    // Nested loop: loop (any loop) inside another loop (inner & outer loops)
        // one iteration of the outer loop, executes all the iteration of the inner loop

    }
}

package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        //break:
        for (int i = 0; i < 5; i++) {

            if (i==3){
                break;  //terminates the loop
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");


        //continue:
        System.out.println("-----------------");

        for (int i = 0; i < 5; i++) {

            if (i==3){
                continue;   //terminates the current iteration of the loop
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");


        //System.exit() :
        System.out.println("-----------------");

        for (int i = 0; i < 5; i++) {

            if (i==3){
                System.exit(0);     //terminates the program (everything after this condition)
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");





    }
}

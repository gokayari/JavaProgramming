package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if( i == 'C'){  //it skips C
                continue;
            }
            System.out.println(i);  //A B D E
        }



        System.out.println("------------------------------");
        //print all even numbers 1∼10

        for (int i = 1; i <= 10 ; i++) {

            if( i%2 != 0){
                continue;   //it skips 1, 3,..
            }
            System.out.println(i);  //2, 4, 6,..
        }


        System.out.println("------------------------------");
        //print all odd numbers 1∼10

        for (int i = 1; i <= 10 ; i++) {

            if( i%2 == 0){
                continue;   //it skips 2, 4,..
            }
            System.out.println(i);  //1, 3, 5,..
        }



    }
}

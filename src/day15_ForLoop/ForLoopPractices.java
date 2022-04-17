package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        //15 16 17 18.... 45

        for (int i = 15; i <= 45; i++ ){
            System.out.print( i + " ");
        }
        System.out.println();


        System.out.println("----------------------");

        // 100 99 98 97... 50

        for (int i = 100; i >= 50; i--){    // >= <= > <
            System.out.print( i + " ");
        }
        System.out.println();


        System.out.println("----------------------");

        // print all the even numbers between 1∼55

        for (int e = 1; e <= 55; e++){
            if (e % 2 == 0){
                System.out.print( e + " ");
            }
        }
        System.out.println();

        //or:
        for (int e = 2; e <= 54; e += 2){
            System.out.print( e + " ");
        }
        System.out.println();




    }
}

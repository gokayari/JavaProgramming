package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = -10;


        if (n > 0) {                            //>> the compiler has to check every conditions

            System.out.println("Positive");
        }
        if (n < 0) {
            System.out.println("Negative");
        }
        if (n == 0) {
            System.out.println("Zero");
        }

        System.out.println("-----------------------------------");
        // comfortable and correct way

        boolean positive = n > 0;
        boolean negative = n < 0;

        if (positive){                      //>> when first condition is true, the compiler skips others
            System.out.println("Positive");
        }else if(negative){                 //>> when first condition is false, the compiler check second condition; if second is true, compiler skips third one
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }


    }
}

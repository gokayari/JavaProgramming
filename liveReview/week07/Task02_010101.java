package week07;

public class Task02_010101 {

    public static void main(String[] args) {

        /*
        1
        10
        101
        1010
        10101
        101010

        again we have 6 rows , 6 columns
		pattern: for odd columns print "1", for even columns "0"

         */

        for (int i = 1; i <= 6; i++) {  // handles rows

            for (int j = 1; j <= i; j++) {   // handles columns

                // ternary operator

                // System.out.print(j%2==1? 1 : 0 ); // for odd columns print "1", for even columns "0"

                if(j%2==1){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }

            }
            System.out.println();

        }
    }
}

package week02;

public class ArithmeticOperators {
    public static void main(String[] args) {

        /*
        Division
        * in math 10/3 = 3.3333
        * in Java 30/3 = 3 reason int/int = int
        * 10/3.0 int/double = double
        * 10.0/3 double/int = double
         */
        System.out.println("10/3 : " + (10/3)); // =3
        System.out.println("10/3.0 : " + (10/3.0)); // =3.33333 double data type
        System.out.println("10 + 3 : " + 10 + 3); // =103 concatenation: String + int
        // = String  "10 + 3 : " + 10 + 3
        // IMPORTANT: JAVA runs from top to bottom and left to right

        System.out.println("10 + 3 : " + (10 + 3)); // =13 addition

        System.out.println("-------------------");

        int num1 = 10;
        double num2 = 3.0;

        int result = (int) (num1/num2); //explicit casting
        System.out.println("result = " + result);


    }
}

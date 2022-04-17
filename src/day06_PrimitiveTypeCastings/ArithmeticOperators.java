package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 8); //128, concatenation

        System.out.println(10 + 20); //30, addition
        System.out.println(100 - 50); //50, subtraction
        System.out.println(10 * 6); //60, multiplication

        System.out.println("----------------------");

        System.out.println( 100 / 3); //33
        System.out.println( 100.0 / 3); //33.3333...

        System.out.println( 10.0 / 4); //2.5
        System.out.println( 10 / 4.0 ); //2.5
        System.out.println((double)10 / 4); //2.5
        System.out.println( 10d / 4); //2.5 (d means decimal)

        System.out.println("------------------");

        int a =100;
        double b = a/6; // 16.0
        System.out.println(b);

        double c = a/6.0; //16.666
        double d = (double)a/6; //16.666
        double e = a/6D; //16.666

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


    }
}
/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division

            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal

            in math:
                10/4 = 2.5
                100/3 = 33.333...

            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33

    %: Remainder
 */
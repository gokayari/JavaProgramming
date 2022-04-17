package week03;

public class DifferenceBetweenAndOrBitwiseOperators {

    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 10;

        System.out.println(true | false);   // true, it checks two parts
        System.out.println(true || false);  // true again, but it does NOT check the SECOND part of statement

        System.out.println(i2>i1 | i1>i2);  // true

        System.out.println(i2>i1 || ++i1>i2);   // first part is true therefore it does not check second part
        System.out.println("i1 = " + i1);   // it will be same: 5 because compiler did not check second part at the last line

        System.out.println(i2>i1 | ++i1>i2);   // it checks both statements
        System.out.println("i1 = " + i1);       // it will be: 6



        boolean a = i2<i1 && i1<++i2;   // false && true, Bitwise and operator: if the first statement is false, DOES NOT check the second statement
        System.out.println("i2 = " + i2);   // same: 10

        boolean a2 = i2<i1 & i1<++i2;   // false & true, first statement is false, but it checks both statements
        System.out.println("i2 = " + i2);   // it will be: 11


    }
}

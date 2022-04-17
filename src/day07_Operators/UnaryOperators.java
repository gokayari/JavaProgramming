package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;     // "+" is optional for a positive value
        int num2 = -25;     // this is not optional you must use "-" for negative value

        System.out.println( num1 < 0 ); // false
        System.out.println( num2 < 0 ); // true

        System.out.println("-------------------------------");

        int a = 5;
        ++a; //pre Increment: increases the value by 1 right away
        System.out.println(a); // 6

        --a; //pre decrement: decreases the value by 1 right away
        System.out.println(a); //6-1= 5 again

        System.out.println("--------------------------------");

        int b = 100;
        System.out.println(++b); //pre Increment: increases the value by 1 right away

        int c = 100;
        System.out.println(c++); // post Increment: first passes the current value, then increases the value by 1
        System.out.println(c); // 101

        System.out.println("----------------------------------");

        int x = 200;

        System.out.println(--x); // 199 <<pre decrement

        int y = 200;

        System.out.println(y--); // is staying at 200 <<post decrement
        System.out.println(y); // now it is going to 199

        System.out.println("-----------------------");

        int z = 45;

        System.out.println(++z); // 46,  z= 46 (right away)
        System.out.println((z++)); // 46, z= 47 (later)
        System.out.println(z); //47

        int q = 30;
        System.out.println(--q); //29, q= 29 (Immediately)
        System.out.println(q--); //29 (passes the current value), q= 28 (current value)
        System.out.println(q); //28 (finally)






    }
}

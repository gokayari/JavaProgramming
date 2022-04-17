package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        System.out.println(a); //100
        short b = a;
        //short b = (short)a;

        int c = b;  // implicit casting
        //int c = (int)b

        long d = c;
        //      (long)c

        float e = d;

        double f = e;

        System.out.println(f);

        System.out.println("-----------------------");

        int x = 55;
        short y = (short)x; // explicit casting

        System.out.println(x + " : " + y);


        long j = 1000000;
        short k = (short)j; //100.0

        System.out.println(j + " : " + k);  //print: 1000000:16960


        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);


        double n = 10.8;
        int s = (int)n;

        System.out.println(n + " : " + s); //print: 10.8 : 10

        System.out.println("-----------------------");

        double d1 = 20.5;
        short s1 = (short) d1;  // after semicolon hold "option" button and press "enter" therefore you can see solutions

        System.out.println(d1 + " : " + s1); // 20.5 : 20


        float f1 = 30.5f;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1); // 30.5 : 30

    }
}

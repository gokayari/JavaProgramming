package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        //Long n1 = num1;   //we can not, it is int

        Integer n1 = num1;  //autoboxing

        int num2 = n1;  //unboxing


        System.out.println("----------------------");

        Integer integerValue = 100;

        long longValue = integerValue;      //it can convert

        Byte b1 = 25;
        byte a1 =b1;        //unboxing
        short a2 = b1;      //unboxing
        int a3 = b1;
        long a4 = b1;


        System.out.println("-----------------");

        int num3 = 200;
        //Long l2 = num3;       //error
        //Double d1 = num3;     //error
        Integer num4 = num3;    //autoboxing


        System.out.println("----------------");

        Integer z = 900;
        Integer y = z;


        System.out.println("-------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer [] numbers2 = {1,2,3,4,5};
    }
}

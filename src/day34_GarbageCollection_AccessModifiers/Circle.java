package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;


    //public static Sheet sheet

    public Circle(double radius){   //constructor is for the instances, not static variables!
        this.radius = radius;
        //pi = 3.14;    //static variable should be initialized one time! here can be initialized multiple time
    }


    static{     //just for the static variables        //*it can get executed automatically even outside the class
        // radius = 5;      //we can not do it
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

    //main method can NOT be automatically executed in other class!, so we use static block(line 22)
    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
    */


}

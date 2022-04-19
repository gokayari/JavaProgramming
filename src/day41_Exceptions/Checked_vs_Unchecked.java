package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //----unchecked exception----:

        int a = 10;
        int b = 0;

//        System.out.println( a/b );    //it occurs during the runtime
                                        //.ArithmeticException

//        System.out.println("Wooden Spoon");   //it doesn't continue, Exit method is executed


        char[] characters = {'A', 'B', 'C'};
        //                    0     1    2
//        System.out.println(characters[99]);     //.ArrayIndexOutOfBoundsException

//        System.out.println("Wooden Spoon");     //it doesn't continue, Exit method is executed


        Student student = null;

//        System.out.println(student.getName());      //.NullPointerException
//        student.study();


        String str = "Wooden Spoon";
        str = null;

//        System.out.println(str.toUpperCase());      //.NullPointerException

        String str2 = "";   //object != null
        System.out.println(str2.isEmpty()); //true


        //----checked exception----:

        System.out.println("Hello");

//        Thread.sleep(3000);     //.InterruptedException

        System.out.println("Cydeo");


//        FileInputStream file = new FileInputStream("path of the file");
                                        //.FileNotFoundException






    }
}

package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");

        try{
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");
        }

        System.out.println("Test1 completed");


        System.out.println("----------------------------");
        //methods of exception objects:

        int[] numbers = {1,2,3,4,5};

        try{

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){    //parent class

//            e.printStackTrace();      //method-1 of exception object

            System.out.println(e.getMessage());     //method-2 of exception object
        }

        System.out.println("Test2 completed");


        System.out.println("------------------");

        System.out.println("Test 3 started");

        try {
            System.out.println("Cydeo".substring(2,0)); //IndexOutOfBoundsException
        }catch (RuntimeException e){      //it is parent class of IndexOutOfBoundsException, that's why better

            e.printStackTrace();
//            System.out.println(e.getMessage());

        }

        System.out.println("Test 3 completed");



        System.out.println("-----------------------");

        System.out.println("Hello");

        try{
            Thread.sleep(3000);     //InterruptedException  //it is NOT RunTimeException!
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cydeo");


        System.out.println("-------------------------");

        try {
            FileInputStream file = new FileInputStream("File Path");    //FileNotFoundException, isn't RunTime!
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

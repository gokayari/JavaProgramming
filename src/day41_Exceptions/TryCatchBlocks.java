package day41_Exceptions;

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
        }

        System.out.println("Test 3 completed");








    }
}

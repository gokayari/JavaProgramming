package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary());   //NullPointerException

        } catch (IndexOutOfBoundsException e) {         //it can not handle it
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){                 //it can not handle it either
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){         //it can not handle it either
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){                //this handles it!
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");


        System.out.println("-----------------------------");

        try {
            System.out.println("Java".charAt(-1));
        } catch (RuntimeException e){
            e.printStackTrace();
        }





    }
}

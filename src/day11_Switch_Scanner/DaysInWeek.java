package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        // long number = 9L;
        // float number = 9F;       ===> you can not use those 4
        // double number = 9D;
        // boolean number = true;

        int number = 5;

        /*
        if(number == 1) {
            System.out.println("Monday");
        }
        ...
        */

        // for switch statement you can not use >= or <= , boolean ...
        // data must be equal or not

        //Switch statement’s expression must be evaluated to a single value, it can not be long, double, float and Boolean data types.

        switch (number) { //1,2,3,4,5,6,7  ==

            case 1:
                System.out.println("Monday");
                break; // exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break; // exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break; // exits the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break; // exits the switch after executing the case block

            //default: //you can also write it on this line or any line (but with break statement!) because only gets executed if one of the case blocks are matching
            //   System.out.println("Invalid number");

            case 6:
                System.out.println("Saturday");
                break; // exits the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break; // exits the switch after executing the case block

            default: //default is not mandatory
                System.out.println("Invalid number");
                break;  //without a "break" is also possible you do not need to give break statement; it is last block and there are curly parentheses at the end }

        }









    }
}

package day09_IfStatements;

import org.w3c.dom.ls.LSOutput;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2001;

        boolean leapYear = year % 4 == 0;

        /*
        if (leapYear){
            System.out.println("Year " + year + " is leap year");
        }
        if (!leapYear){              // (i)>>> compiler is still working on it, because the 2nd "if" condition is Independent of the first "if"
            System.out.println("Year " + year + " is NOT leap year");
        }
         */


        if (leapYear){
            System.out.println("Year " + year + " is leap year");
        }else{                        //(i)>>> but hear the compiler skip it. Compiler writes according to the first condition
            System.out.println("Year " + year + " is NOT leap year");
        }


    }
}

package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'C';
        String result = "";

        switch (ch){    //switch statement does not accept boolean!


            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);

        /* // you can also write like that:
            case 'A': case 'B': case 'C': case 'D':
            result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
             */




    }
}
/*
    if the grade is A or B or C or D ======> "Passed"
    otherwise ==> "Failed"
 */
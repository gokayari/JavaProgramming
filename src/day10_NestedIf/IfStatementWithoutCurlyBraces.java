package day10_NestedIf;

public class IfStatementWithoutCurlyBraces {
    // DO NOT DO THIS!

    public static void main(String[] args) {
    // pre-condition: if there is only one statement in the block
        int number = 9;
        String result = "";

        if(number >=1 && number <=12){

            if(number == 1) // we can also write without curly braces,
                result = "January"; //<<< but this only applies when there is a situation
            else if(number == 2)            //that's why it is always recommended to write it with curly braces
                result = "February";
            else if(number == 3)
                result = "March";
            else if(number == 4)
                result = "April";
            else if(number == 5)
                result = "May";
            else if(number == 6)
                result = "June";
            else if(number == 7)
                result = "July";
            else if(number == 8)
                result = "August";
            else if(number == 9)
                result = "September";
            else if(number == 10)
                result = "October";
            else if(number == 11)
                result = "November";
            else
                result = "December";


        }else{ //if the number is not valid
            result = "Invalid Number";
        }

        System.out.println(result);





    }

}

package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 5;     //1 ∼12

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;  // for the months that has 30 days
        // boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;
        boolean has31Days = !has28Days  &&  !has30Days; //easier way
        // boolean has31Days = number>=1 && number<=12 && !has28Days  &&  !has30Days; //>>>My solution

        if(has28Days){      //if the month has 28 days
            System.out.println("28 days");
        }
        if(has30Days){      //if the month has 30 days
            System.out.println("30 days");
        }
        if(has31Days){      //if the month has days
            System.out.println("31 days");
        }
    }
}

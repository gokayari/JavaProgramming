package day24_CustomMethod_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

        nameOfTheMonth(11);
    }

    //3. Create a method that can display the name of the month based on the given number to the method.
    public static void nameOfTheMonth(int number) {

        if (number < 1 || number > 12){
            System.out.println("Invalid");
            return;     //exits nameOfTheMonth method, *remaining code fragments of method never gets executed
        }

        String name =  (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar"
                : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun"
                : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep"
                : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";


        System.out.println("Month name = " + name);
    }
}

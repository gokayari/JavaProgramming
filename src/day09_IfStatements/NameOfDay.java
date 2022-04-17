package day09_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        int n = 3; // 1 ∼ 7
        //String day;

        if (n == 1){
            System.out.println("Monday");
            //day = "Monday";             //>>better way
        }else if(n == 2){
            System.out.println("Tuesday");
        }else if(n == 3){
            System.out.println("Wednesday");
        }else if(n == 4){
            System.out.println("Thursday");
        }else if(n == 5){
            System.out.println("Friday");
        }else if(n == 6){
            System.out.println("Saturday");
        }else if(n == 7){
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid");
        }


        System.out.println("----------------------------");
        //*** Better way ***

        String day;

        if (n == 1){
            day = "Monday";
        }else if(n == 2){
            day = "Tuesday";
        }else if(n == 3){
            day = "Wednesday";
        }else if(n == 4){
            day = "Thursday";
        }else if(n == 5){
            day = "Friday";
        }else if(n == 6){
            day = "Saturday";
        }else if(n == 7){
            day = "Sunday";
        }else {
            day = "Day is Invalid";
        }

        System.out.println(day);

    }
}

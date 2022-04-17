package day09_IfStatements;

import java.util.Scanner;

public class NameOfDay_Scanner {

    public static void main(String[] args) {

        System.out.println("Write a number between 1-7: ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        String day;

        number.close();

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

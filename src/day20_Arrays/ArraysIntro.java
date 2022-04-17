package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names
        //String[] strGroup;
        //String strGroup[]; >> it is also correct, depends on our preferences

        String[] myGroup = new String[5];   //0 ∼ 4
        myGroup[0] = "Günay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hülya";
        myGroup[4] = " Mikael";

        System.out.println(myGroup);    //hashcode >>> wrong way to print array

        System.out.println(Arrays.toString(myGroup));   //to print Array

        System.out.println("---------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:            0           1          2           3           4         5          6
        //days [7] ="New Day"; //you can not do

        System.out.println(Arrays.toString(days));

        int number =5;

        if (number <1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);     //5th day:Friday






    }
}

package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {       //with curly braces:
            System.out.println("Cydeo");    //5 times
            System.out.println("EU 08");    //5 times
        }

        for (int i = 0; i < 5; i++)         //without curly braces:
            System.out.println("Cydeo");    //5 times
            System.out.println("EU 08");    //once


    }
}

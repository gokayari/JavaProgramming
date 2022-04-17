package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=,  <, <= , ==, !=

        boolean result1 = 200 > 40; // (greater than) true
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // (greater than) true
        System.out.println("result2 = " + result2);

        boolean result3 = 100>= 100; // (equal) true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; // false (first number is not greater than second number or equal to the second number)
        System.out.println("result4 = " + result4);

        //credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if credit score is 720 or greater, then it's eligible for loan


        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 200<180; // false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <= 59; // true
        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 6;
        System.out.println("result7 = " + result7); // false


        System.out.println("------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x == y;
        //             100 == 200 ? >>>no, false

        System.out.println("equal = " + equal);


        boolean result8 = "Muhtar" == "Good Guy"; // false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //false
        System.out.println("result9 = " + result9);

        boolean result10 = " Java " == " Java "; // true
        System.out.println("result10 = " + result10);
        // boolean result10 = " Java      " == "Java"; >>> false

        System.out.println("--------------------------------");

        boolean result11 =  100 != 200.5; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);

        boolean result14 = "Bosch" != "Bosch"; // false
        System.out.println("result14 = " + result14);









    }
}

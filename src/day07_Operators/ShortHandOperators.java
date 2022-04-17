package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment : =
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200; // you can write new value for "number" like that

        System.out.println("number = " + number); // 200 <<updated the value

        String word = "Java Programming";

        System.out.println("word = " + word); //word "Java Programming"

        word = "Wooden Spoon";

        System.out.println("word = " + word); //updated "Wooden Spoon"

        word = "Cydeo";

        System.out.println("word = " + word); //Cydeo

        // word = 123; error>>> you can NOT give Integer for new value after String!

        word = "123" + 1; //1231

        word = "Java Programming";

        System.out.println("word = " + word); // you can write same value again

        System.out.println("-------------------------------------------------");

        //Addition Assignment: +
            int x = 100;

        System.out.println("x = " + x); //100
        System.out.println(x+200); //300
        System.out.println("x = " + x); //100 again

        // x = x + 200; >>300
        x += 200; // >> Addition Assignment
        System.out.println("x = " + x); // 300

        String str = "Wooden"; // word "Wooden"
        str += " Spoon"; // words "Wooden Spoon" <<<Concatenation

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); // 2.5

        num1 += 5.5;
        System.out.println("num1 = " + num1); // 8.0


        double availableBalance = 1000.50;
        // deposit 300$
        availableBalance += 300; // 1000.50+300.00

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("--------------------------------");

        // Subtraction Assignment: -

        //withdrawing 500$
        availableBalance -= 500; // 1300.50-500= 800.50

        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 225$, then depositing 450$
        availableBalance -= 225;
        availableBalance += 450;
        System.out.println("availableBalance = " + availableBalance); // new result= 1025.5

        System.out.println("--------------------------");

        // Multiplication Assignment : *

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *= 2; //Multiplication Assignment 50000.50*2= 100001.0
        System.out.println("salary = " + salary); //100001.0

        double doge = 0.0000001;
        doge *= 1000000;
        System.out.println("doge = " + doge); //0.1

        System.out.println("---------------------------");

        //Division Assignment : /

        double num2 = 25000;

        //num2 = num2 /2;

        num2 /= 2;      //Division Assignment
        System.out.println("num2 = " + num2); //12500

        System.out.println("--------------------------");

        //Remainder Assignment : %

        double num3 = 100;

        // %: remainder assignment operator

        num3 %= 3;
        System.out.println("num3 = " + num3); // 100/3= (99*3)+1 >>> 1.0 is remainder

        System.out.println("----------------------------");

        int amount = 127; // cents

        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("------------------------");

        int cents2 = 127;

        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("-------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("---------------------------");

        int balance = 3500;

        //Insurance fee: $153

        balance %= 153;

        System.out.println("balance = " + balance);



    }
}

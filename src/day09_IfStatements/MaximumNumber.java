package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 60;
        int num2 = 95;

        boolean num1Max = num1 > num2;

        if (num1Max){
            System.out.println(num1 + " is the maximum number");
        }else{
            System.out.println(num2 + " is the maximum number");
        }

    }
}

package week02;

public class PrimitivesExample {

    public static void main(String[] args) {


/*
        DataType variableName= Value, Declare and initialize at the same line


        DataType variableName;
        variableName = value;

        DataType variableNameOne, variableNameTwo;

 */     byte num1; // Declaring a variable
        num1 = 123; // Initializing a variable, assigning a value
        num1 = 121; // re-assign a value
        short num2 = 12398; // declare and initialize at the same line
        int distance = 1_000_000_000;
        long distanceMore = 3_000_000_000l; // we have put L or l to define the variable
        long distanceShorter = 1_000_000_000; // if it does not pass the limit then we don't have to give

        float rate = 1000.5f;
        double dNumber = 123.6;

        System.out.println("-----Castings------");

        System.out.println("Before Swapping Values");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // you might need to swap or re-assign some different range of values

        num2 = num1; // I am assigning num1 value to num2
        // implicit casting, Widening, done by the compiler



    }
}

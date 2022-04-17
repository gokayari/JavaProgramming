package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 12;

        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        /*
        in order for a to be the median number:
                    1. if c is the max number & b is the min number, then a is the median number
                    2. if b is the max number & c is the min number, then a is the median number
         */ // two scenarios
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        boolean cIsMedian = (c>a && c<b) || (c>b && c<a);
        // boolean cIsMedian = !bIsMedian && !aIsMedian; // alternate for 3rd condition


        if (aIsMedian) {
            System.out.println( a + " is the median number");
        }
        if (bIsMedian) {
            System.out.println( b + " is the median number");
        }
        if (cIsMedian) {
            System.out.println( c + " is the median number");
        }

        //---------------------------------------------------------
        boolean error = !aIsMedian && !bIsMedian && !cIsMedian;     //my additional solution
        if (error){         // my additional solution
            System.out.println("Error. Some numbers are equal!");
        }
    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */
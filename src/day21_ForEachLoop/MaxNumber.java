package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers ={10, 5, 4, 20, 1, 0};
        int max = numbers[0];
        int min = numbers[0];
/*        //numbers.fori: shortcut

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){   //if there is element in the array that's greater than the current max number
                max = numbers[i];   //assigning greater number to variable max
            }

        }
        System.out.println("max = " + max);



 */
        //shortcut: "iter" or "numbers.for"

        for (int number : numbers) {
            if(number > max){
                max = number;
            }
            if (number < min);
                min = number;
        }
        System.out.println(max);
        System.out.println(min);





    }
}

package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500,600};
        numbers = removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));     //{100,300,400,500,600}

        numbers = removeElement(numbers,1);     //{100,400,500,600}

        System.out.println("------------");

        String[] words = {"Java", "Python", "Cydeo"};

        words = removeElement(words, 2);
        System.out.println(Arrays.toString(words));     //{"Java", "Python"}

    }

//                                  {1,2,3,4,2}  ,    1
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){       //if the index of array is matching with the given index
                continue;       //skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){       //if the index of array is matching with the given index
                continue;       //skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){       //if the index of array is matching with the given index
                continue;       //skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){       //if the index of array is matching with the given index
                continue;       //skip
            }
            result[j++] = array[i];
        }
        return result;
    }


}
/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parameters: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parameters: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parameters: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */
package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        arr = replaceAll(arr, 30,55);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------");

        String[] names = {"Java", "C++", "C++", "Python", "C++"};

        names = replaceAll(names, "C++", "C#");
        System.out.println(Arrays.toString(names));
    }

    //replaces all the element of the array that matching with the given old element with the given new element
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){  //equal operator
                array[i] = newValue;    //assignment operator
            }
        }
        return array;
    }

    //replaces all the element of the array that matching with the given old element with the given new element
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){  //equal operator
                array[i] = newValue;    //assignment operator
            }
        }
        return array;
    }

    //replaces all the element of the array that matching with the given old element with the given new element
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){  //equal operator
                array[i] = newValue;    //assignment operator
            }
        }
        return array;
    }

    //replaces all the element of the array that matching with the given old element with the given new element
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){  //equal operator
                array[i] = newValue;    //assignment operator
            }
        }
        return array;
    }




}
/*
2. ReplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays

 */
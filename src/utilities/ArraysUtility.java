package utilities;

import java.util.Arrays;

public class ArraysUtility {            //look also day25-Test2 and day26 classes

    //overloading:

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each integer of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each integer of a string array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //prints each integer of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    //overloading:

    //returns the maximum number for integer array
    public static int maxNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length -1];
    }

    //returns the maximum decimal number for double array
    public static double maxNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length -1];
    }


    //returns the minimum number for integer array
    public static int minNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minimum number for double array
    public static double minNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }



    //checks if the given integer is contained in the given array. returns boolean.   contains (int[], int)
    public static boolean contains(int[] array, int element){
        //                          {1,2,3,4} ,       6
        boolean result = false;

        for (int each : array) {
            if (each == element){
                result = true;
                //break;    //we can use
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean.   contains (double[], double)
    public static boolean contains(double[] array, double element){
        //                      {1.5, 2.5, 3.5, 4.5} ,     6.5
        boolean result = false;

        for (double each : array) {
            if (each == element){
                result = true;
                //break;    //you can use
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. returns boolean.   contains (char[], char)
    public static boolean contains(char[] array, char element){
        //                      {'a', 'b', 'c', 'd'} ,   'f'
        boolean result = false;

        for (char each : array) {
            if (each == element){
                result = true;
                //break;    //you can use
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean.   contains (String[], String)
    public static boolean contains(String[] array, String element){
        //                    {"Java", "Python", "Selenium"}, "C#"
        boolean result = false;

        for (String each : array) {
            if (each == element){
                result = true;
                //break;    //you can use
            }
        }
        return result;
    }


    //overloading:

    //adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;     //i=0,1,2,3
        }

        result[i] = element;        //here i=4, because we used post-increment

        //result[result.length -1] = element;   //opt2

        return result;
    }

    //adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;
        //result[result.length -1] = element;   //opt2

        return result;
    }

    //adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        //result[result.length -1] = element;   //opt2

        return result;
    }

    //adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;        //element need to be assigned to the last index
        //result[result.length -1] = element;   //opt2
        return result;
    }



    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }


    //unique elements:

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[]array){

        int[] result = {};

        for (int each : array) {

            if( ArraysUtility.frequencyOfElement(array, each) == 1){     //if the frequency is 1. the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[]array){

        double[] result = {};

        for (double each : array) {

            if( ArraysUtility.frequencyOfElement(array, each) == 1){     //if the frequency is 1. the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[]array){

        char[] result = {};

        for (char each : array) {

            if( ArraysUtility.frequencyOfElement(array, each) == 1){     //if the frequency is 1. the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[]array){

        String[] result = {};

        for (String each : array) {

            if( ArraysUtility.frequencyOfElement(array, each) == 1){     //if the frequency is 1. the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    //remove elements:

    //removes the index from the array, returns new array
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

    //removes the index from the array, returns new array
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

    //removes the index from the array, returns new array
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

    //removes the index from the array, returns new array
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


    //merge:

    //merge the given two arrays and returns new array
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = new double[arr1.length + arr2.length];

        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = new char[arr1.length + arr2.length];

        int i = 0;

        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = new String[arr1.length + arr2.length];

        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }


    //reverse:

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


    //replace:

    //replaces the element of the array at given index with the new element, and returns the new array
    public static int[] replace(int[] array, int index, int newElement){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces the element of the array at given index with the new element, and returns the new array
    public static double[] replace(double[] array, int index, double newElement){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces the element of the array at given index with the new element, and returns the new array
    public static char[] replace(char[] array, int index, char newElement){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces the element of the array at given index with the new element, and returns the new array
    public static String[] replace(String[] array, int index, String newElement){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replaceAll:

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


    //remove duplicates:

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

}
//48
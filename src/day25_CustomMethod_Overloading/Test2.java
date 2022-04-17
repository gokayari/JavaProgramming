package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("-----------------");

        String[] arr4 = {"Java", "Python", "Cydeo"};

        ArraysUtility.printEachElement(arr4);


        System.out.println("===================");

        int[] n1 = {10,2,3,4,5,6};

        int max1 = ArraysUtility.maxNumber(n1);
        int min1 = ArraysUtility.minNumber(n1);

        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        System.out.println("---------------");

        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};

        double max2 = ArraysUtility.maxNumber(n2);
        double min2 = ArraysUtility.minNumber(n2);

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);


        System.out.println("==============");

        int[] a1 = {1,2,3,4,5,6,7};
        boolean r1 = ArraysUtility.contains(a1, 5);

        System.out.println(r1);

        System.out.println("------------");

        double[] a2 = {1.5, 2.6, 3.7, 4.8};
        boolean r2 = ArraysUtility.contains(a2, 1.5);

        System.out.println(r2);

        System.out.println("---------------");

        







    }
}

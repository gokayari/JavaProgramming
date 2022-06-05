package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        //Predicate:

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);


        System.out.println("---------");


        Predicate<Integer> isEven = p -> p %2 == 0;

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));
        list.removeIf(isEven);
        //list.removeIf(p -> p % 2 == 0);

        System.out.println(list);


        System.out.println("---------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);

        System.out.println(names);


        System.out.println("---------------------");

        //Consumer:

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++){
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("----------------------");


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /*
        for (Integer each : list2) {
            if(each % 2 != 0){
                System.out.println(each);
            }
        }
         */
        list2.forEach( p -> { if(p%2==0) System.out.println(p);});

        System.out.println("------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(
                s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ")+1) ) );


        System.out.println("------------------------");

        //Function:

        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a){
                result.add(each);
            }
            return result;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);


        System.out.println("-----------------------------");

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++){
                result[i] = a.get(i);
            }
            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] result2 = convertToArray.apply(numbers);

        System.out.println(Arrays.toString(result2));

        System.out.println("---------------------------");

        //tasks, my solutions:
        // create a function that can return the maximum number from an int array

        Function <int[], Integer> maxNumber = a -> {

            int maxNum = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > maxNum){
                    maxNum = a[i];
                }
            }
            return maxNum;
        };

        int[] arr1 = {1,2,3,4,55,66,77,8};
        Integer max = maxNumber.apply(arr1);
        System.out.println(max);

        // create a function that can swap the first and last elements of an array

        Function<String[],String[]> swapElements = a -> {
            String [] result = new String[a.length];
            String temp ="";
            int n = 0;
            for (int i = 0; i < a.length; i++) {
                if (i == 0){
                    result[a.length-1] = a[i];
                    n++;
                    continue;
                }
                if (i == a.length-1){
                    result[0] = a[a.length-1];
                    n++;
                    continue;
                }
                result [n] = a[i];
                n++;
            }
            return result;
        };

        String[] arr2 = {"Java", "Python", "C++", "C#"};

        arr2 = swapElements.apply(arr2);
        System.out.println(Arrays.toString(arr2));

        // Create a function that can reverse an array and returns it

        Function<String[],String[]> reverseArray = a -> {

            String[] result = new String[a.length];
            for (int i = 0, y= a.length-1; i < a.length; i++, y--) {
                result[i] = a[y];
            }
            return result;
        };
        arr2 = reverseArray.apply(arr2);
        System.out.println(Arrays.toString(arr2));


        // create a function that can reverse a List





    }
}

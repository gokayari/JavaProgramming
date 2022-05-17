package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        String[] arr1 = set1.toArray(new String[0]);
        // String[] arr1 = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);  //option2

        System.out.println(set1);   //=hashSet
        System.out.println(Arrays.toString(arr1));   //according to hashSet

        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        String[] arr2  = set2.toArray(new String[0]);
        System.out.println(Arrays.toString(arr2));   //according to LinkedHashSet

        System.out.println("----");

        ArrayList<Integer> list  = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>( new LinkedHashSet<>(list));

        System.out.println(list);

        System.out.println("----------------");

        String[] array = {"A", "A", "B", "C"};

        Set<String> s = new LinkedHashSet<>(Arrays.asList(array));
        s.addAll(Arrays.asList("E", "F", "G"));

        System.out.println(s);  //[A, B, C, E, F, G]

        System.out.println("-----------------------------------------------");
        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */


        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>( Arrays.asList(nums) ).toArray( new Integer[0] );

        System.out.println(Arrays.toString(nums) );

        System.out.println("-------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";


        String result = "";     //e10a4b4c4d3

                         //Set(LinkedHashSet)------------------------------------>
                                              //asList-------------------------->
                                                            //Array------------>
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")), each);
            result += each+count;
        }
        System.out.println("result = " + result);


        System.out.println("-------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println( "index-2 = " + names.toArray(new String[0])[2] );

        System.out.println( "index-4 = " + new ArrayList<>(names).get(4)  );


        for(String each : names ){
            System.out.println(each);
        }


    }
}

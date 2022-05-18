package day50_Collections;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set = " + set);

        //Integer[] array = set.toArray(new Integer[0]);
                        // you can't add or delete, and it doesn't have ready method as a list

        List<Integer> list = new ArrayList<>(set);

        System.out.println("list = " + list);


        List<String> names = null;

        //System.out.println(names.size());   //NullPointerException

        System.out.println("----------------------");

        //pop(): LIFO           (Stack class)

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        ((Stack) chars).pop();
        //or// ((Stack<Character>) chars).pop();
        /*if line 30 was "Stack<Character> chars = new Stack<>();"
        we would not use casting at line 33
         */

        System.out.println("chars = " + chars); //[A, B, C]


        //poll(): FIFO      (any Queue subclass)

        List<String> names1 = new LinkedList<>();
        names1.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println("names = " + names1);

        ((LinkedList<String>) names1).poll();

        System.out.println("names = " + names1);

        ((LinkedList<String>) names1).poll();

        System.out.println("names = " + names1);

    }
}

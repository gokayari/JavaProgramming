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


    }
}

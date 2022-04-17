package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        //sort():

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);     //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println(list);

        System.out.println("----------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(list2);

        //reverse():

        Collections.reverse(list2);  //[E, D, C, B, A]

        System.out.println(list2);

        System.out.println("-----------------");
        //swap():

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        Collections.swap(list3, 1, 4);
            //Collections.swap(list3, 4, 1);    //same as before one

        System.out.println(list3);  //[10, 50, 30, 40, 20, 60, 70]

        System.out.println("------------------------");

        int max = Collections.max(list3);   //70
        int min = Collections.min(list3);   //10

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------");
        //replaceAll():

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4, 10,5);    //[5,5,20,30,40,50,5,5,5]
        System.out.println(list4);

        System.out.println("--------------");
        //frequency():

        int frequency = Collections.frequency(list4, 5);    //5
        System.out.println("frequency = " + frequency);

        System.out.println("-----------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}

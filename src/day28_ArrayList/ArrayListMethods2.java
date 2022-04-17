package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
/*
        int num = 1;
        list.remove(num);       //removed index number 1 : 200


        Integer num = 200;
        list.remove(num);       //removed object 200
*/

        //list.remove(200);     //int:200 is index number, it is error


        Integer num = 2000;
        boolean r = list.remove(num);

        System.out.println(list);
        System.out.println(r);

        System.out.println("---------------");

        //clear():

        System.out.println(list.size());    //7

        list.clear();       //removes all elements

        System.out.println(list.size());    //0


        System.out.println("-------------------");

        //indexOf(): & lastIndexOf():

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');        //0     //returns int value
        int b = characters.lastIndexOf('A');    //4     //returns int value

        System.out.println(a);
        System.out.println(b);


        System.out.println("-----------------");

        //contains():

        boolean r2 = characters.contains('A');  //true

        boolean r3 = characters.contains('Z');  //false

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("--------------");

        //equals():

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);     //false
        System.out.println(list1.equals(list2));    //true

        System.out.println("--------------");

        boolean r4 = list1.isEmpty();   //false

        System.out.println("r4 = " + r4);


        System.out.println("----------------");

        //addAll():

        ArrayList<Integer> numbers = new ArrayList<>();
    //Bulk Operation: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7 ));

        System.out.println(numbers);



    }
}

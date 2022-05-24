package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        //   key       value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Java");
        hashMap.put(20, "Python");
        hashMap.put(30, "Jack");
        hashMap.put(3, "Emma");
        hashMap.put(40, "Isabella");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Hasan");    //when a key is duplicated it takes only last value "Hasan"
        hashMap.put(7, "Hasan");
        hashMap.put(8, "Hasan");    //value can be duplicated
        hashMap.put(null, "Cihad");
        hashMap.put(null, "Hulya");     //'null' key or value is allowed

        System.out.println("hashMap = " + hashMap);    //order is random


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Java");
        linkedHashMap.put(20, "Python");
        linkedHashMap.put(30, "Jack");
        linkedHashMap.put(3, "Emma");
        linkedHashMap.put(40, "Isabella");
        linkedHashMap.put(7, "Hasan");
        linkedHashMap.put(8, "Hasan");      //value can be duplicated
        linkedHashMap.put(null, "Hulya");       //'null' key or value is allowed

        System.out.println("linkedHashMap = " + linkedHashMap); //it keeps insertion order

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Java");
        treeMap.put(20, "Python");
        treeMap.put(30, "Jack");
        treeMap.put(3, "Emma");
        treeMap.put(40, "Isabella");
        treeMap.put(7, "Hasan");
        treeMap.put(8, "Hasan");        //value can be duplicated
        //treeMap.put(null, "Hulya");   //it does NOT accept 'null' key
        treeMap.put(18, null);        //but value can be 'null'

        System.out.println("treeMap = " + treeMap);     //sorted (Ascending) order

        Map<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(10, "Java");
        hashtable.put(20, "Python");
        hashtable.put(30, "Jack");
        hashtable.put(3, "Emma");
        hashtable.put(40, "Isabella");
        hashtable.put(7, "Hasan");
        hashtable.put(8, "Hasan");        //value can be duplicated
        //hashtable.put(null, "Hulya");   //it does NOT accept 'null' key
        //hashtable.put(18, null);        //and value can also not be 'null'

        System.out.println("hashtable = " + hashtable);     //order is random
    }
}

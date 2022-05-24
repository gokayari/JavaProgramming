package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score:

        Map<String, Integer> students = new HashMap<>();

        //put():
        students.put("Aygun", 85);
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex", 86);
        students.put("Hulya", 98);
        students.put("Ozan", 78);
        students.put("Andriy", 85);

        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87);    //for "Ali" just that (last one) will be displayed, duplication is not allowed for 'key'

        System.out.println(students);

        //size():
        System.out.println("students.size() = " + students.size());

        //display the score of "Alex"
        //get():
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));

        //replace "Ali"s score
        //replace():
        students.replace("Ali", 95);
        System.out.println(students);

        //remove():
        students.remove("Alex");
        System.out.println(students);
        students.remove("Ozan");
        System.out.println(students);

        //containsKey():
        boolean r1 = students.containsKey("Muhtar");    //false
        boolean r2 = students.containsKey("Hulya");     //true

        System.out.println(r1);
        System.out.println(r2);

        //containsValue():
        boolean r3 = students.containsValue(98);    //true

        //isEmpty():
        System.out.println("students.isEmpty() = " + students.isEmpty());

        System.out.println("-----------------");

        //putAll():
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println(map1);
        System.out.println(map2);

        //equals()
        System.out.println(map1 == map2);   //false
        System.out.println(map1.equals(map2));  //true


    }
}

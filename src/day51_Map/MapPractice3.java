package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);   //max
        map.put("James", 145000);   //max
        map.put("Conor", 85000);
        map.put("Josh", 145000);    //max
        map.put("Cory", 145000);    //max
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        // displays the names of all employees who has the maximum salaries

        //Solution#1:
        /*
        int maxSalary = Integer.MIN_VALUE;

        for (Integer eachValue : map.values()) {
            if (eachValue> maxSalary){
                maxSalary = eachValue;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
        */

        //Soution#2:
        int maxSalary = Collections.max(map.values());



        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxSalary){
                System.out.println(pair.getKey());
            }
        }



    }
}

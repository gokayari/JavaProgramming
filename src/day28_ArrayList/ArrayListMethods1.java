package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        //add():

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);    //0
        numbers.add(20);    //1
        numbers.add(30);    //2
        numbers.add(40);    //3
        numbers.add(50);    //4

        numbers.add(2,25);      //2 //insert as index number 2
        numbers.add(5, 45);     //5 //insert

        System.out.println(numbers);

        System.out.println("--------");

        //size():

        System.out.println(numbers.size());     //7

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("---------");

        //get():

        numbers.get(3); //it is Integer Wrapper Class   //3 is int index number

        int num = numbers.get(3);   //unboxing

        System.out.println("num = " + num);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();
        System.out.println("----------");

        //set():

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");      //similar to replace method
        list.set(3, "C++");

        System.out.println(list);

        System.out.println("------------------");

        //remove():

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygün");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hülya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(1);    //removed "Aygün"

        System.out.println(employees);

        employees.remove(1);    //removed "Olga"

        System.out.println(employees);

        employees.remove(0);    //removed "Suat"

        System.out.println(employees);

        employees.remove(employees.size()-1);   //last element removed

        employees.remove("Hülya");  //removed "Hülya"

        System.out.println(employees);

        boolean r1 = employees.remove("Ali");   //this object is removed or not?
        boolean r2 = employees.remove("Neira");

        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


    }

}

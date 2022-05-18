package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < 4){
                list1.remove(i);
            }
        }

        System.out.println(list1);   //[2, 4, 5, 2, 4, 5, 2, 4, 5] //it does not work

        System.out.println("==================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator();

        /*
        boolean r1 = it.hasNext();

        System.out.println(r1); //true

        System.out.println(it.next());  //1

        boolean r2 = it.hasNext();
        System.out.println(r2); //true

        System.out.println(it.next());  //2
         */

        while (it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }
        }
        System.out.println(list2);  //[4, 5, 4, 5, 4, 5] // works with iterable

    }
}

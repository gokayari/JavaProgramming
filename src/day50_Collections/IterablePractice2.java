package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice2 {    //interview question

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

            //remove all the names "ahmed"

        //names.removeAll(Arrays.asList("Ahmed"));  //is NOT a solution

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);


        System.out.println("-------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        for ( Iterator<String> i = names2.iterator(); i.hasNext(); ){
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }

        System.out.println(names2);

        System.out.println("----------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names3.removeIf(each -> each.equalsIgnoreCase("ahmed"));
        System.out.println(names3);
    }
}

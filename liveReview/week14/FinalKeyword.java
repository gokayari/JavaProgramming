package week14;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalKeyword {

    final int b;      //initialization is mandatory
    final static int c;
//    final int d;  //compiler error
//    d=10;

    public FinalKeyword(int b){
        this.b = b;
    }

    static {
//      b=10;   //static block CANNOT access to instance members, error!
        c=5;
    }


    public static void main(String[] args) {

        // local variables : if we don't use it, initialization is not mandatory
        final int a;
        a = 100;
        System.out.println(a);

        //Final Arrays:

        final int[] nums = {1,2,3};
        System.out.println(nums[0]);    //1
        nums[0] = 5;
        System.out.println(Arrays.toString(nums));  //5,2,3

    //   nums = new int[]{5,6,7};  //We can not assign a new array object to our array reference variable
                                    //error!

        //Final ArrayList
        final ArrayList<String> colors = new ArrayList<>();

        colors.add("Orange");
        colors.add("Red");

        colors.remove(0);

    //    colors = new ArrayList<>();     //error!

        //What is becoming final :
        //final keyword is used for 'Variable'

    }
}

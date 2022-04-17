package week11;

import java.util.ArrayList;

public class TestTV {

    public static void main(String[] args) {

        //we will create a TV object

        TV Samsung = new TV();  //new keyword invokes our constructor with no parameters
        System.out.println(Samsung.toString());

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung.toString());

        TV LG = new TV();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG.toString());

        LG.turnOn();    //after turn on setVolume and setChannel will be changed
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG.toString());

        TV Sony = new TV();

        //Arraylist
        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);

        for (TV eachTv : tvList) {  //eachTv: becomes object reference for our TV objects
            System.out.println("Is the TV on? " + eachTv.on);
        }




    }

}

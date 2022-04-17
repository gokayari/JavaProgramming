package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {    //main method can not be more than one

        System.out.println("Main Method");

    }

    static{     //runs first before anything, and only runs once
        System.out.println("Static Block 1");
    }

    static{
        System.out.println("Static Block 2");
    }

    static{
        System.out.println("Static Block 3");
    }

}

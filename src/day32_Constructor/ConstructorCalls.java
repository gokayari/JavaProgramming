package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this(9);      //it can not contain itself!
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();         //must be first statement/step
        System.out.println("Constructor with an int argument");
    }

    public ConstructorCalls(String str){
        this(10);
        //this();       //it can not be called more than one
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();     //first constructor

        System.out.println("----------------");

        ConstructorCalls obj2 = new ConstructorCalls(8);    //second constructor but it calls also first const.

        System.out.println("--------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");
        //it is third constructor, it contains 2nd const., second contains 1st const.
        System.out.println("----------------");
    }

}

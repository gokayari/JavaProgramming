package week12.static_examples;

public class StaticMethods {

    public int num = 10;

    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
        //System.out.println(num);  //you get error, you can not call instance from static method!
        System.out.println("count = " + count);
    }


    public void instanceMethod(){
        System.out.println("count = " + count);     //I can call static field from instance method
        System.out.println("InstanceMethod");
        System.out.println("num = " + num);
        displayMessage("hello from instance method");
    }


}

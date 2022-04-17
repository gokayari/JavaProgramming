package week12.static_examples;

public class StaticTest {

    public String instanceValue = "Selenium";
    public static String word = "Java";

    public static void main(String[] args) {
        //System.out.println(instanceValue);    //it can not be called, error
        System.out.println(word);

        //I want to use displayMessage method, do I have to create object? NO
        StaticMethods.displayMessage("Hello static function");

        StaticMethods object = new StaticMethods();
        object.displayMessage("Hello, I am using object to call you");
        //variables
        System.out.println(StaticMethods.count);
        System.out.println(object.count);

        StaticMethods object2 = new StaticMethods();
        System.out.println(object2.num);
        object2.count = 15; //because it is static, count will be 15 for object also

        System.out.println(object.count);   //15

        //call instance method
        //StaticMethods.instanceMethod();   //compiler error, I have to use an object
        object.num = 3;
        object2.num = 4;

        System.out.println("-----");
        object.instanceMethod();
        System.out.println("-----");
        object2.instanceMethod();




    }


}

package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;
    public double price;

    public static String operatingSystem = "IOS";

    public String color;
    public String size;

    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchSystem = true;
    public static boolean hasFaceTime = true;

    /*
    public static void printModelAndPrice(){
        System.out.println(model + " : " + price);  //static methods do not accept instances
    }
    */
    public static void printOperatingSystem(){
        System.out.println(operatingSystem);
    }


}

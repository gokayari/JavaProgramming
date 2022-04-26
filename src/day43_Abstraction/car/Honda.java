package day43_Abstraction.car;

public class Honda extends Car{
                    //it CANNOT be abstract class, otherwise we cannot create objects

    public Honda(String brand, String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    public void start() {
        System.out.println("Twist the key to ignition");
    }


}

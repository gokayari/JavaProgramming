package day43_Abstraction.car;

public final class Audi extends Car{    //final class for autoPark

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){
        //We write for this method "final" class so that it cannot be used in another class.
        System.out.println(getBrand() + " " + getModel() + " has Auto-park feature");
    }
}

package day37_Inheritance.animalTask;

public class Cat extends Animal{        //there is a shortcut with mouse left click or by Generate

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}

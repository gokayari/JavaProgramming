package day40_FinalKeyword;

public final class Dog extends Animal{      //Dog class can not be parent class (super class)

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName() + " is eating dog food");
    }

    /*
    public void drink(){            //final methods can not be overridden
        System.out.println(getName() + " is drinking beer");
    }
    */

    public void bark(){
        System.out.println(getName() + " is barking");
    }

}

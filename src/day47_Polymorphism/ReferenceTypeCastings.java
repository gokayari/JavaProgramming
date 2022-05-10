package day47_Polymorphism;

import day43_Abstraction.person.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4);    //upcasting

        Shape shape2 = new Circle(5);   //upcasting

        //WebDriver driver = (WebDriver) new ChromeDriver();


        //Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //Dog dog = animal;     //error!
        //Dog dog = (Dog) animal;     //downcasting
        //dog.bark();

        //System.out.println(dog.getName());
        System.out.println(animal.getName());


        //animal.bark();       //error!
        ((Dog)animal).bark();


        Shape shape1 = new Square(5);

        System.out.println(((Square)shape1).getSide());


        System.out.println("-------------------------");

        Animal animal1 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal1;
        //cat.meow();

        ((Cat) animal1).meow();     //downcasting
        //((Dog) animal1).bark();     //ClassCastException, because animal1 is a cat

        System.out.println("--------------");

        Employee employee = new Tester("Ali",30,'M', 42, "SDET", 60000);

        ((Tester) employee).bugReport();

        //((Tester) employee).unitTest();   //error! Tester has no unitTest() method
        //((Developer) employee).unitTest();  //not error but ClassCastException, because employee is now a tester

        //Driver driver =(Driver) employee;   //.ClassCastException, driver and tester have no "is a" relationship
        Person person = (Person) employee;
        //Teacher teacher = (Teacher) employee; //.ClassCastException, teacher and tester have no "is a" relationship


        System.out.println("-----------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //( (Cube)s1 ).volume();  //.ClassCastException, Circle cannot be converted to Cube







    }
}

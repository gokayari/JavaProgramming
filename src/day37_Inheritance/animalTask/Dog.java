package day37_Inheritance.animalTask;

public class Dog extends Animal{

//  public int a;       //intance variable from sub class (this class= dog)
                                                                                    //..., int a){
    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);   //instance vaiables from super class (Animal)
//      this.a = a;
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}

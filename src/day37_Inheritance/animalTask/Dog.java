package day37_Inheritance.animalTask;

public class Dog extends Animal{

//  public int a;       //instance variable from sub class (this class= dog)
                                                                                    //..., int a){
    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);   //instance variables from super class (Animal)
//      this.a = a;

//      this() //=will call a constructor from another constructor within the same class
//      //*** super() and this() can not be in the same constructor!
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}

package day43_Abstraction.person;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching Maths");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " likes to eat salad");
    }

    public void sleep(){
        System.out.println(getName() + " sleeps 8 hours");
    }

}

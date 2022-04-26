package day43_Abstraction.person;

public final class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving the bus");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping 9 hours");
    }
}

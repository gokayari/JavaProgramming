package day43_Abstraction.person;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the app");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " likes to eat chicken");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 7 hours");
    }

    public void bugReport(){
        System.out.println(getName() + " is creating bug reports");
    }
}

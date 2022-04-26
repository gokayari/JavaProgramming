package day43_Abstraction.person;

public abstract class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if ( !(gender=='M' || gender== 'F') ){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 16){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }


    public abstract void eat();

    public abstract void sleep();


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

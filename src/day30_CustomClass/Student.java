package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    //this. keyword:

    //shortcut: right click - "Generate" - "Constructor" and select all items:
    //and write void setInfo instead of "Student"
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    //shortcut: right click - "Generate" - toString():
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

}

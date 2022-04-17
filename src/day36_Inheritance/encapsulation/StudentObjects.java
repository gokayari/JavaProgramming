package day36_Inheritance.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Gökay", 2, 'A', 'U', "ABC");
        System.out.println(student1);

        //student1.age(30);     //error
        student1.setAge(30);
        student1.setGender('M');
        student1.setGrade('A');
        System.out.println(student1);



    }
}

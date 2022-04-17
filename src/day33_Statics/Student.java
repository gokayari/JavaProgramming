package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int age;
    public long studentID;
    public char grade;
//1
    public Student(String name){
        this.name = name;
    }
//2
    public Student(String name, char gender){
        this(name);
        this.gender = gender;
    }
//3
    public Student(String name, long studentID){
        this(name);
        this.studentID = studentID;
    }
//4
    public Student(String name, long studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }
//5
    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }
//6
    public Student(String name, char gender, int age, long studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }
//7
    public Student(String name, char gender, int age, long studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }


    public void study(){
        System.out.println(name + " is studying.");
    }
}
/*
1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				1. Add a constructor that allows user to create object by setting the name of student

				2. Add a constructor that allows user to create object by setting the name and gender of the student

				3. Add a constructor that allows user to create object by setting the name and studentID of the student

				4. Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				5. Add a constructor that allows user to create object by setting the name, gender and age of the student

				6. Add a constructor that allows user to create object by setting the name, gender, age and studentID of the student

				7. Add a constructor that allows user to create object by setting the name, gender, age, studentID and grade of the student

				Actions:
					toString()
					study()
 */
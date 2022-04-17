package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

                    //1.constructor
    public Employee(String name){
        this.name = name;
    }

    //constructor overloading:
                    //2.constructor
    public Employee(String name, char gender){
        //this(name);     //constructor call: this is another constructor that is on the 10th line
        //Employee(name);   //we can not call like that
        this.name = name;
        this.gender = gender;
    }

    /*
                    //3.constructor
    public Employee(String name, char gender, String jobTitle){
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
    }
    */
                    //3.constructor
    public Employee(String name, char gender, String jobTitle) {
        this(name, gender); //instead of calling each of instance one by one can we just call this function from line 15
        this.jobTitle = jobTitle;
    }

                    //4.constructor
    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



    //call method:
    /*
    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        method2();
    }
    */



}

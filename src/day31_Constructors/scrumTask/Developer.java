package day31_Constructors.scrumTask;

public class Developer {

    public String name, jobTitle;
    public long employeeID;
    public double salary;

    public Developer(String name, String jobTitle, long employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=$" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }

}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fields

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */
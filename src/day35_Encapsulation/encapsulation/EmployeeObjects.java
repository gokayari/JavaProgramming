package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);

        System.out.println(employee1);

        Employee employee2 = new Employee("", 'Q', -10, -2000); //invalid instance variables

        System.out.println(employee2);  //{name='null', gender= , age=0, salary=0.0}

        //employee2.age(29);        //you can not
        employee2.setAge(29);
        employee2.setGender('M');
        employee2.setName("Tahir");
        employee2.setSalary(employee2.getSalary() + 100000);    //0 + 100_000

        System.out.println(employee2);  //{name='Tahir', gender=M, age=29, salary=100000.0}




    }




}

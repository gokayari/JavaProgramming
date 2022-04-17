package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 120000;

        Employee employee3 = new Employee();
        employee3.name = "Fady";
        employee3.salary = 150000;

        System.out.println(employee1.name); //Ahmet
        System.out.println(employee1.salary);   //150000
        System.out.println(employee2.name); //Aygun
        System.out.println(employee2.salary);   //150000
        System.out.println(employee3.name); //Fady
        System.out.println(employee3.salary);   //150000
        // because it was not instance variable it was static variable for salary in the Employee class

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);

    }
}

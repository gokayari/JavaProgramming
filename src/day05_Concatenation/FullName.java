package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Gökay";
        String lastName = "Ari";
        int age = 30;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        //Full name of te person is ____
        System.out.println("Full name of the person is " + fullName);

        //____ is __ years old
        System.out.println( fullName + " is " + age + " years old");

        //Full Name is JobTitle, works at CompanyName, and FullName' salary is Salary
        System.out.println( fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is $" + salary );
    }
}

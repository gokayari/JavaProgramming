package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "gÖkAY",
                lastName = "ArI";

        //we cannot use firstName.charAt(0), because the char character cannot be uppercase
        //but if you still want to use charAt() method, one way >>> ("" + firstName.charAt(0)) : it converted to String with double quotes""

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);
    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
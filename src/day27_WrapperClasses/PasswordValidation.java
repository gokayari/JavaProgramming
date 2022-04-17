package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scan.nextLine();

        scan.close();

        String result;

        result = "Password is strong: " + isStrongPassword(password);

        System.out.println(result);
    }

    public static boolean isStrongPassword(String password) {

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;     //upper case
        boolean r3 = false;     //lower case
        boolean r5 = false;     //digit
        boolean r4 = false;     //special char

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {     //!Character.isLetterOrDigit(each)
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }
}
/*
Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */

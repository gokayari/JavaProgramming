package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("Cydeo") && p.equals("Cydeo123")){ // if credentials are valid
            System.out.println("Logged in");
        }else{      //if credentials are not valid
            int attempts = 3;
            while( !(u.equals("Cydeo") && p.equals("Cydeo123")) &&  attempts >0  ){     //true && true >> continue,  true && false >> out
                /*
                if(attempts == 1){
                    System.out.println("THIS IS YOUR LAST CHANCE!");
                }
                 */ //<<< you can add this
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                u = scan.next();
                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }

            if(u.equals("Cydeo") && p.equals("Cydeo123")){  //After (3)attempts if credentials are valid or not valid
                System.out.println("Logged in");
            }else{
                System.err.println("Your account is locked");
            }

        }

        scan.close();


    }
}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */
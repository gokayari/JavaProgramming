package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {
        // &&,  ||,  !

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18  &&  citizen == "USA";
        //                    19 >= 18  &&    "UK"  == "USA"
        //                      true    &&        false    :>>> false

        System.out.println( name + " is eligible to vote in USA: "+ isEligible );


        String name2 = "Khalid";
        int age2 = 17;
        String citizen2 = "USA";

        boolean isEligible2 = age2 >= 18  &&  citizen2 == "USA";
        //                    17 >= 18  &&    "USA"  == "USA"
        //                      false    &&        true    :>>> false

        System.out.println( name2 + " is eligible to vote in USA: "+ isEligible2 );


        String name3 = "Ketty";
        int age3 = 20;
        String citizen3 = "USA";

        boolean isEligible3 = age3 >= 18  &&  citizen3 == "USA";
        //                    20 >= 18  &&    "USA"  == "USA"
        //                      true    &&        true    :>>> true

        System.out.println( name3 + " is eligible to vote in USA: "+ isEligible3 );

        System.out.println("-------------------------------------------");

        String name4 = "Josh";

        int creditScore = 720;
        int age4 = 23;
        int income = 65000;

        boolean isEligible4 = creditScore >= 700 && age4 >= 21 && income >= 60000;
        System.out.println(name4 + " is eligible for loan: " + isEligible4); // true
        //                                  true    true    true    = true

        String name5 = "Tim";

        int creditScore2 = 800;
        int age5 = 29;
        int income2 = 40000;

        boolean isEligible5 = creditScore2 >= 700 && age5 >= 21  &&  income2 >= 60000;
        System.out.println(name5 + " is eligible for loan: " + isEligible5); // false
        //                                  true    true    false   = false


        System.out.println("--------------------------------------");

        String name6 = "Shay";

        int age6 = 21;
        char gender = 'F';

        boolean isEligible6 =  age6 >= 18  &&  (gender == 'M' || gender == 'F');
        //                       21 >= 18  &&  ( 'F' == 'M'  ||  'F' == 'F' )
        //                       true      &&   ( false     ||   true )
        //                          true   &&   true
        //                                true

        System.out.println( name6 + " is eligible to register: " + isEligible6);

        System.out.println("----------------------------------------------");

        String name7 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = true;

        boolean isEligible7 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println( name7 + " is eligible to apply for US citizenShip: " + isEligible7);

        System.out.println("------------------------------------------------------");

        String student = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible8 = gpa >= 3.5  ||  familyIncome<= 60000;
        //                       true        ||           false
        //                                  true

        System.out.println( student + " is eligible for scholarship: " + isEligible8);

        System.out.println("-------------------------------------------");

        boolean result2 = false;
        boolean result3 = !result2;

        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        System.out.println("---------------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);











    }
}

package day24_CustomMethod_Return;

public class BreakfastsTasks {

    public static void main(String[] args) {

        initials("gökay", "Ari");       //G.A

        System.out.println("------------");

        domain("Cydeo.School@gmail.com");   //gmail


        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "elminur@cydeo.com", "gulse@gmail.com"};

        for (String email : emails) {
            domain(email);      //gmail,    yahoo,  cydeo,  gmail
        }

        System.out.println("---------------");

        nameOfTheMonth(4);  //April

        System.out.println("---------------");

        nameOfDay(5);   //Fri

        System.out.println("-----------------------");

        daysInMonth(9);


    }


    //1. Create a method that can display the initials of the person.   initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }


    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email) {    //Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }


    //3. Create a method that can display the name of the month based on the given number to the method.
    public static void nameOfTheMonth(int number) {

        String name = "";

        if (number >= 1 && number <= 12) {      //Nested-if is faster than this(*look down)
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" :
                    (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" :
                            (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);
    }


    //4. Create a method that can print the name of the day based on the given number to the method.
    public static void nameOfDay(int number){

        String name = "";

        if ( number >=1 && number <=7 ){
            name = (number==1)? "Mon" : (number==2)? "Tues" : (number==3)? "Wed" : (number==4)? "Thurs" :
                    (number==5)? "Fri" : (number==6)? "Sat" : "Sun";
        } else {
            name = "Invalid";
        }

        System.out.println("name = " + name);
    }

    //my solution
    //5. Create a method that can print how many days a month has.
    public static void daysInMonth(int number){
        int days = 0;

        if (number >= 1 && number <= 12) {

            switch (number){
                case 1: case 3: case 5: case 7: case 8:
                case 10: case 12:
                    days = 31;
                break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                break;
                default:
                    days = 28;
            }

          }else{
            System.out.println("Invalid");
        }
        System.out.println("days = " + days);


    }

    //ageGroups()





}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

	6. age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */

/*
(*)
name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" :
                    (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" :
                            (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" :
                                (number == 12) ? "Dec" : "Invalid";
 */
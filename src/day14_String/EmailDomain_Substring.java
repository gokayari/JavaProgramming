package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String eMail = "Cydeo.School@gmail.com";

        //domain:
        int beginningIndex = eMail.indexOf("@")+1;
        int endingIndex = eMail.lastIndexOf(".");

        String result = eMail.substring( beginningIndex , endingIndex);

        System.out.println("result = " + result);


        //Second (My)Way
        String eMail2 = "School.Cydeo@yahoo.com";

        String result2 = eMail2.substring( eMail2.indexOf("@")+1 , eMail2.lastIndexOf("."));

        System.out.println("result2 = " + result2);



    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = School.Cydeo@yahoo.com

		output:
			yahoo

 */
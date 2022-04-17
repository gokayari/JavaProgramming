package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";

        //Eligible
        if(isEligible){
            System.out.println(name + " is Eligible");
        }

        //Not Eligible
        if(!isEligible){
            System.out.println(name + " is Not Eligible");
        }

    }
}

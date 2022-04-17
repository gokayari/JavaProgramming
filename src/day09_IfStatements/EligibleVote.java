package day09_IfStatements;

public class EligibleVote {

    public static void main(String[] args) {

        int age = 17;

        boolean eligible = age >= 18;

        if (eligible){
            System.out.println("The person is eligible to vote");
        }else{
            System.out.println("The person is NOT eligible to vote");
        }
    }
}

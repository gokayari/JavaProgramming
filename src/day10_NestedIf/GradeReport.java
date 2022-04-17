package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*
        90 ∼ 100: Excellent
        80 ∼ 89: Great
        70 ∼ 79: Good
        60 ∼ 69: Passed
        0 ∼ 60 : Failed
         */


        int score = 95;

        if(score >= 0 && score <= 100){
            // 5 possibilities: A, B, C, D, F
            if(score >= 90){    // when false: score<90
                System.out.println("Excellent");
            }else if(score >= 80) { // >>>this is correct we do not have to write >>>(score >= 80 && score <90) because compiler already checked last condition and it was false and score <90
                System.out.println("Great");
            }else if(score >= 70){
                System.out.println("Good");
            }else if(score >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else {  // if the score is NOT valid
            System.out.println("Invalid score");
        }

        System.out.println("---------------------------");
        //>>>SECOND WAY

        String result = ""; // temporary

        if(score >= 0 && score <= 100){
            // 5 possibilities: A, B, C, D, F
            if(score >= 90){    // when false: score<90
                result = "Excellent";
            }else if(score >= 80) { // >>>this is correct we do not have to write >>>(score >= 80 && score <90) because compiler already checked last condition and it was false and score <90
                result = "Great";
            }else if(score >= 70){
                result = "Good";
            }else if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else {  // if the score is NOT valid
            result = "Invalid score";
        }
        System.out.println(result); //for this solution we just use one println






    }
}

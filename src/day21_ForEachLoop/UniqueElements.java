package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Java", "Java",
                "Oleksandr", "Olga", "Adam", "Adam",
                "C#", "Python", "Python"};


        for (String each : words){

            int count = 0;

            for (String element : words){
                if (element.equals(each)){
                    count++;
                }
            }

            if (count == 1){                //if element is unique
                System.out.println(each);
            }

        }



    }
}
/*
Step1:(inner loop)

        int count = 0;

        for (String element : words){
            if (element.equals("Layan")){
                count++;
            }
        }
 */
/*
Step 2: (outer loop)

        for (String each : words){

            int count = 0;

            for (String element : words){
                if (element.equals(each)){
                    count++;
                }
            }
        }
 */
/*
Step 3: (Add unique cond.)

        if (count == 1){        //if element is unique
                System.out.println(each);
            }
 */
package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        //
        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {

            int frequency = frequency(str, str.charAt(i));

            if (frequency == 1){
                System.out.println(str.charAt(i) + " is unique character");
            }
        }

        int frequency2 = frequency(str, 'a');
        System.out.println("frequency of a is " + frequency2);




    }
//                                    "aaa"      'a'
    public static  int frequency(String str, char ch){

        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch){
                count++;
            }
        }
        return count;

    }




}

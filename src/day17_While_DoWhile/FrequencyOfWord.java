package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {
        
        String str = "JavaJavaJava";
        
        int frequency = 0;
//                                  12  -  4  = 8 >>> in the 12th Line >>> str.substring(8, 12)
        for (int i = 0; i <= str.length() -4; i++) {
            String eachSub = str.substring(i, i+4);  //i+4= can be max. =12 (lastIndex+1)

            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println(frequency);




    }
}
/*
2. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3



            substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

 */
package week07;

public class FrequencyOfCharacters {

    /*
    What is pseudocode?:

    -Iterate over given string with an outer loop so that you can get each get char
     */

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";     //a2b1c3d1

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // ''

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (c == str.charAt(j)){
                    count++;
                }
            }
            if (result.contains(""+c)){
                continue;
            }

            result += c;
            result += count;


        }

        System.out.println("result = " + result);



    }
}

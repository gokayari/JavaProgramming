package day20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Java", "Java", "Oleksandr", "Olga", "Adam", "Adam", "C#", "Python", "Python"};



        for (int j = 0; j < words.length; j++) {
            String element = words[j];  //j=0 >>>"Layan", j=2 >>>"Java"...

            int frequency =0;
            for (int i = 0; i < words.length; i++) {    //to find the frequency of element from array
                if(words[i].equals(element)){
                    frequency++;
                }
            }

            if(frequency == 1){     //to find and print unique element
                System.out.println(element);
            }
        }






    }
}

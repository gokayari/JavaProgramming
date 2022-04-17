package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        //this method easier than FrequencyOfWord and FOW2 classes!!

        String str = "Java Java Python Python";

        int frequency = 0;

        while(str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency++;
        }
        System.out.println(frequency);


        System.out.println("-------------------------------");

        String sentence = "cat cat cat CAT cat CAt dog cat dog dog CAT";
        sentence = sentence.toLowerCase();

        int countCat = 0;

        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);


        System.out.println("-------------------------------");

        String s = "java java java python python python c++ c++";

        int countJava = 0;
        int countPython = 0;
        int countC$$ = 0;

        while(s.contains("java") || s.contains("python") || s.contains("c++")){

            if (s.contains("java")){
                s = s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }
            if (s.contains("c++")){
                s = s.replaceFirst("c++", "");
                countC$$++;
            }

        }

        System.out.println("countJava = " + countJava);     //3
        System.out.println("countPython = " + countPython);     //3
        System.out.println("countC++ = " + countC$$);       //2




    }
}
/*
	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2nd Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"

 */
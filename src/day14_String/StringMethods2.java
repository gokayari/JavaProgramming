package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        //replace():

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python");   //"Python is fun, I love learning Python"

        System.out.println(str);
        System.out.println(str2);


        String email = "JohnSmith@yahoo.com";   //update>>> JohnSmith@gmail.com

        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);


        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";  //we want to delete all "Python"
        String sentence2 = sentence.replace("Python", ""); //>>> // sentece2 = Java Java   C# C# C++ C++     //it is not enough
        String sentence3 = sentence.replace("Python", "").replace("  ", "");        //that is correct

        System.out.println("sentence2 = " + sentence2);
        System.out.println("sentence3 = " + sentence3);


        String s = "Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog" , "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#" , " Java"); //we want to change only second "C#"
        System.out.println("s2 = " + s2);   //"C# is fun, Java is cool"

        System.out.println("------------------------------");
        //replaceFirst():

        String result = "Java Java Java";

        result = result.replaceFirst("Java", "Python");     //"Python Java Java"
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";

        result2 = result2.replaceFirst("C#", "Java");   //"Java is fun, C# is cool"
        System.out.println("result2 = " + result2);





    }
}

package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        //isEmpty():

        String str = "    ";

        boolean r = str.isEmpty();
        System.out.println(r);  //false

        //isBlank():

        boolean r1 = str.isBlank();
        System.out.println(r1); // true


        String str2 = " Cydeo              ";
        System.out.println(str2.isBlank()); //false


        System.out.println("-------------------------------------");

        // equals() & equalsIgnoreCase():

        String s1 = "CYDEO";
        String s2 = "Cydeo";

        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equalsIgnoreCase(s2));    //true

// Yes, yEs, YEs, yes...

        System.out.println("yEs".equalsIgnoreCase("YeS"));  //true

        System.out.println("-------------------------------------");

        //contains():

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");    //false
        boolean hasJava = sentence.contains("Java");    //true
        boolean hasJava2 = sentence.contains("java");   //false
        boolean hasJava3 = sentence.toLowerCase().contains("java");  //true >>> that is the best solution

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);


        System.out.println("-------------------------------------");

        //startsWith(): & endsWith():

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");    //true
        boolean y = a.endsWith("Spoon");    //true

        boolean z = a.toLowerCase().startsWith("wooden");   //true
        //in order to ignore the case sensitivity we first create the lower case or upper case

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}

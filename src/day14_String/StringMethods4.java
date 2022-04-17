package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {

        //repeat():

        String str = "Cydeo";

        String str2 = str.repeat(4);        // Cydeo x 4 times
        System.out.println("str2 = " + str2);   //= CydeoCydeoCydeoCydeo

        String s1 = "Wooden Spoon";

        String s2 = s1.repeat(100);         //Wooden Spoon x 100 times
        System.out.println("s2 = " + s2);   //Wooden SpoonWooden SpoonWooden SpoonWooden Spoon...

        System.out.println("-----------------------------------------");

        System.out.println("FADY\n".repeat(10));

        System.out.println("-----------------------------------------");

        String name = "Java";

        System.out.println( (name + " ").repeat(5));    //Java Java Java...



    }
}

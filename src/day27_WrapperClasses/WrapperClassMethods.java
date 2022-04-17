package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        //parse method:

        String str = "123";

        int num = Integer.parseInt(str);    //int       //it is not autoboxing or unboxing

        System.out.println(num +1);     //124
        System.out.println(str +1);     //1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); //double
        System.out.println(num2 +1);    //11.5
        System.out.println(str2 +1);    //10.51

        System.out.println("=================");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max value of Integer primitive = " + max);
        System.out.println("min value of Integer primitive = " + min);


        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max value of Long primitive = " + max2);
        System.out.println("min value of Long primitive = " + min2);

        System.out.println("===================");


        String s1 = "true";

        boolean r1 = Boolean.parseBoolean(s1);  //true

        String s2 = "false";
        String s3 = "maybe";    //any words

        boolean r2 = Boolean.parseBoolean(s2);  //false
        boolean r3 = Boolean.parseBoolean(s3);  //false

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("-------------------");

        //valueOf method:

        String s4 = "123";
        Integer x = Integer.valueOf(s4);  //Integer
        int y = Integer.valueOf(s4);  //int       (unboxing)

        System.out.println(x);      //123
        System.out.println(y);      //123

        String s5 = "1.5";
        Double z = Double.valueOf(s5);  //Double

        System.out.println(z);      //1.5

        System.out.println("--------------------");

        //isDigit() & isLetter()

        char ch1 = 'A';

        boolean r4 = Character.isDigit(ch1);    //false   'A'
        boolean r5 = Character.isLetter(ch1);   //true    'A'

        System.out.println(r4);
        System.out.println(r5);


        char ch2 = '§';
        //special char

        boolean r6 = !Character.isLetterOrDigit(ch2);   //true : it is special character '§'

        System.out.println(r6);

        //upperCase
        boolean r7 = Character.isUpperCase(ch1);    //true  'A'

        //lowerCase
        boolean r8 = Character.isLowerCase(ch1);    //false  'A'

        System.out.println(r7);
        System.out.println(r8);

        System.out.println("=====================");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);   // "":to convert char to String,
            }                                           // parseInt: to convert String to int
        }
        System.out.println("sum = " + sum); //1+2+3+4 =10

    }
}

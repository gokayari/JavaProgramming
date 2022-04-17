package week03;

public class UnaryReview {

    public static void main(String[] args) {

        int a = 20;

        System.out.println("a = " + a++);   //20 //use the variable then increase by 1
        System.out.println("a = " + a);     //21

        int b = 20;
        System.out.println("++b = " + ++b); //21 //increase by 1 then use the variable

        int c = 20;
        System.out.println(++c + 1); // 22

        boolean isMarried = false;
        System.out.println("isMarried = " + !isMarried); // not operator

        System.out.println("----------------------------------------");

        int x = 12;

        if(++x>12){ //pre-Increament
            System.out.println("x in the IF : " + x);   // x=13 it prints this
        }else{
            System.out.println("x value in the ELSE : " + x);
        }

        int y = 12;

        if(y++>12){ //post Increament
            System.out.println("y in the IF : " + y); // y=12 it does not print this, prints next line
        }else{
            System.out.println("y value in the ELSE : " + y); // it prints this but now y=13
        }
    }
}

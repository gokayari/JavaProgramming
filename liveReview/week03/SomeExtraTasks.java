package week03;

public class SomeExtraTasks {

    public static void main(String[] args) {

        int b = 2;

        boolean res = ++b == 2 || --b == 2 && --b == 2; // false (b:3), 2 == 2 (true) >>TRUE therefore it checks third statement: (b:1) false >> true && false = false

        System.out.println(b); //b=1

        System.out.println(res);

        System.out.println("-------------------");
        //my solution
        
        int a = 2;
        boolean res2 = ++a == 2 && --a == 2 || --a == 2; // false (a:3) therefore it passed second statement >>FALSE (and a: still 3) and for || it checks third statement: (a:2) true >> false || true = true

        System.out.println(a); // a=2

        System.out.println(res2);
    }
}

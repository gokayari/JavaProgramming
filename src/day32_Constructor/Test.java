package day32_Constructor;

public class Test {

    public Test(){
        System.out.println("A");
    }

    public Test(int a){
        this();
        System.out.println("B");
    }

    public Test(double b){
        this(10);
        System.out.println("C");
    }

    public Test(String str){
        this(2.5);
        System.out.println("D");
    }

    public Test(char ch){
        this("Java");
        System.out.println("E");
    }

    public static void main(String[] args) {
        Test test1 = new Test(1);   //A B

        Test test2 = new Test('Z');   //A B C D E
    }
}

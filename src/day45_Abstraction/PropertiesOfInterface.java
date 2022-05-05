package day45_Abstraction;

public interface PropertiesOfInterface {

//    int a;                        //it is not final
    int a = 100;    //static & final by default
//    private int c = 100;          //you can create only with public access modifier

//    static int b;                 //it is not final
    static int b = 200; //final by default
/*
    public PropertiesOfInterface(int a){        //you can not create constructor
        this.a = a;
    }
*/

/*
    static{                                 //interface can not have any block
        b = 100;
    }
*/

/*
    public void method1(){                  //interface can not have instance method
        System.out.println("Instance method");
    }
*/

    public static void method2(){           //you can create static method
        System.out.println("Static method");
    }

    public abstract void method3();         //you can create abstract method

    public default void method4(){
        System.out.println("Default method");   //you can create default method
    }

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();
    }
}
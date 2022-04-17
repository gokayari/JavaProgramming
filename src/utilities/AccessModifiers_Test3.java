package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test3 extends ProtectedAccessModifier {

    public static void main(String[] args) {

//        System.out.println(AccessModifiers_Test3.name1);
                    //default is not visible outside the package
        System.out.println(AccessModifiers_Test3.name2);
                    //protected is visible outside the package in subclass ONLY

//        AccessModifiers_Test3.method1();
        AccessModifiers_Test3.method2();



    }
}

package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
        //p1.name = "Daniel";      //compiler error
        //p1.age = 28;             //compiler error

        p1.setName("Daniel");
        p1.setAge(28);

        //System.out.println(p1.name + " : " + p1.age);

        System.out.println(p1.getName() + " : " + p1.getAge());

        Person p2 = new Person();
        p2.setName("Mark");
        p2.setAge(-22);     //invalid age!, after that, program is terminated

        System.out.println(p2.getName() + " : " + p2.getAge());




    }
}

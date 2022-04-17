package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        //A∼Z
        for (char a = 'A'; a <= 'Z'; a++ ){     //A B C D...Z
            System.out.print( a + " ");
        }
        System.out.println();

        //a∼z
        for (char a = 'a'; a <= 'z'; a++ ){     //a b c d...z
            System.out.print( a + " ");
        }
        System.out.println();

        //Z∼A
        for (char a = 'Z'; a >= 'A'; a-- ){     //Z Y X ...A
            System.out.print( a + " ");
        }
        System.out.println();

        //z∼a
        for (char a = 'z'; a >= 'a'; a-- ){     //z y x...a
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

        //second Way: (First way easier!)

        //A∼Z ===>> 65∼90 from ASCII table

        for (int a = 65; a <= 90; a++ ){
            System.out.print( (char)a + " ");
        }
        System.out.println();

        System.out.println("-------------------------------");




    }
}

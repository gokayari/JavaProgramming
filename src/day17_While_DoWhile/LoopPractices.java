package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {     //if we need 1 to 10 best solution is for loop
            System.out.println(i);  //1, 2, 3, ...
        }

        System.out.println("--------------------------");

        int j=1;
        while (j <= 10){
            System.out.println(j);  //1, 2, 3, ...
            j++;
        }

        System.out.println("--------------------------");

        int k = 1;
        do {
            System.out.println(k);  //1 //2, 3, 4, (after line25)
            k++;
        }while (k <= 10);   //2, 3, 4,..





    }
}

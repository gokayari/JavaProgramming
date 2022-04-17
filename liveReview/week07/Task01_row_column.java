package week07;

public class Task01_row_column {

    public static void main(String[] args) {


        /*
Print below pattern using loop

        rows : 5
        columns : 5
            1
            2 6
            3 7 10
            4 8 11 13
            5 9 12 14 15

           (1
            2-"4"-6
            3-"4"-7-"3"-10
            4-"4"-8-"3"-11-"2"-13
            5-"4"-9-"3"-12-"2"-14-"1"-15)
 */

        int rowCount = 5;
        for (int row = 1; row <= rowCount ; row++) {

            int value = row;
            for (int col = 1; col <= row ; col++) {
                System.out.print(value +" ");
                value += rowCount-col;      //1 += (5-1)    //adding 4 for col=1, adding 3 for col=2
            }
            System.out.println();
        }





    }
}


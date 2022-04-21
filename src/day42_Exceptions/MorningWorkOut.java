package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("---------------Push up started---------------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up " + i);
            sleep(1.5);
                //we prefer to use this (custom) sleep method instead of "Thread.sleep"
           /*
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
        }

        System.out.println("\n-------------Push ups completed--------------");


        System.out.println("\n---------------Pull up started---------------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull up " + i);
            sleep(2.5);
                //we prefer to use this (custom) sleep method instead of "Thread.sleep"
            /*
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
        }

        System.out.println("\n-------------Pull ups completed--------------");

    }

    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds * 1000));  //seconds is double, therefore we have to convert explicitly to "long"
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */
package week04;

public class TrafficLightSelector {

    public static void main(String[] args) {

        char color = 'R';

        switch (color){
            case 'R': case 'r':     //or logic
                System.out.println("Red light");
            case 'Y': case 'y':
                System.out.println("Yellow light");
            case 'G': case 'g':
                System.out.println("Green light");
            default:
                System.out.println("Invalid Light");
        }
    }
}

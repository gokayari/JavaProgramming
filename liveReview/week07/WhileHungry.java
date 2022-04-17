package week07;

public class WhileHungry {

    public static void main(String[] args) {

        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        //alternate way but not the best
        /*
        while (isHungry){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C " + bananas);
            //unicodes: D83C DF4C for banana emoji
            // condition that will change the boolean to false
            if( bananas == countToFull){
                isHungry = false;
            }
        }

        System.out.println("Had enough bananas, let's get back to study");
*/

        while (true){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C " + bananas);
            if( bananas == countToFull){
                break;
            }
        }
        System.out.println("Had enough bananas, let's get back to study");


    }
}

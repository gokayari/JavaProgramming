package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int number = 5;

        //String result = "";

        /*
        if(number >=1 && number <=12){

            if(number == 1) {
                result = "January";
            }else if(number == 2){
                result = "February";
            }else if(number == 3){
                result = "March";
            }else if(number == 4){
                result = "April";
            }else if(number == 5){
                result = "May";
            }else if(number == 6){
                result = "June";
            }else if(number == 7){
                result = "July";
            }else if(number == 8){
                result = "August";
            }else if(number == 9){
                result = "September";
            }else if(number == 10){
                result = "October";
            }else if(number == 11){
                result = "November";
            }else{
                result = "December";
            }

        }else{
            result = "Invalid Number";
        }
        */
        //In Ternary:

        String result= (number==1)? "Jan" : (number==2)? "Feb" : (number==3)? "Mar" : (number==4)? "Apr" :
                (number==5)? "May" : (number==6)? "Jun" : (number==7)? "Jul" : (number==8)? "Aug"
                        : (number==9)? "Sep" : (number==10)? "Oct" : (number==11)? "Nov"
                        : "Dez";

        System.out.println(result);

        //OR without parentheses:

        int number1 = 5;

        String result1= number1==1? "Jan" : number1==2? "Feb" : number1==3? "Mar" : number1==4? "Apr" :
                number1==5? "May" : number1==6? "Jun" : number1==7? "Jul" : number1==8? "Aug"
                        : number1==9? "Sep" : number1==10? "Oct" : number1==11? "Nov"
                        : "Dez";

        System.out.println(result1);


    }
}

package week02;

public class CarInfo {

    public static void main(String[] args) {

        // I want to give example of the car that you will buy after you find a well payed job
        int year = 2022;
        String make = "Audi";
        String model = "A6";
        // automatic = true; manuel = false;
        boolean transmission = true;
        String color = "black";
        int mileage = 0;
        int price = 100_000; // for EU

        System.out.println(year+ " " + make + " " +model+ "\nAutomatic Transmission :"+transmission);
        System.out.println(color+" - " + mileage+" kilometers - "+price+" Euros");

        double princeInTL = price*15.5;

        double taxRate = 1.80; // for this kinds of cars

        double priceAfterTaxInTL = princeInTL+(princeInTL*taxRate);

        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

        // Variables are used, because it makes our data reusable and maintainable

    }
}

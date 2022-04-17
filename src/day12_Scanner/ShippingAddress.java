package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.next();    //>>> next()

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        input.nextLine();   //EnterEnter //>> for 25. and 28. lines

        System.out.println("Enter your country name");
        String country = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);


        input.close();

    }
}
/*
1. Enter your full name
2. Enter your building number
3. Enter your street name
4. Enter your city name
5. Enter your state
6. Enter your zip code

Display the shipping address
 */
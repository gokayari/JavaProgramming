package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        /*
        String name = "James King";
        String buildingNumber = 11821B"
         */

        String name = "James King",                             // it is multiple type
                buildingNumber = "11821B",                      // this type is easier
                streetName = "Jonas Branch Dr",                 //each variable is "String"
                city = "McLean",                                //and must use " , "
                state = "VA",
                zipCode = "22031A";

        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state + " " + zipCode;

        System.out.println(address);

    }
}
/*
Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
 */

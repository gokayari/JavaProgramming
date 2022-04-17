package week04;

public class VendingNestedIf {

    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "coffee";
        String snackItem = "chips";

        //Day37Notes on String equality: we will not use "==" sign for String equality, we will use
        //equals() method

        if ( selection == "drink"){
            System.out.println("drink option is selected");
            if (drinkItem == "tea"){
                System.out.println("Tea item is selected");
            }else if (drinkItem == "coffee"){
                System.out.println("Coffee item is selected");
            }

        }else if (selection == "snack"){
            System.out.println("Snack option is selected");
            if(snackItem == "chips"){
                System.out.println("Chips item is selected");
            }else if (snackItem == "candy"){
                System.out.println("Candy item is selected");
            }

        }else{
            System.err.println("INVALID ENTRY");
        }


        System.out.println("--------------------------");
        //we can also without curly braces{}

        if (5<2)
            System.out.println("Hello");
        System.out.println("Running");

    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"

when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */
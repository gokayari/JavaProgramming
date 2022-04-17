package week05;

public class DynamicSubstring {

    public static void main(String[] args) {

        String searchResult = "result count:12345";
                            // 0123456789...
        //substring() method: it takes index location of the char, returns you a new string

        String searchResult1 = searchResult.substring(13);
        System.out.println(searchResult1);   //12345

        System.out.println(searchResult.indexOf(":"));  //index:12
        int colonIndex = searchResult.indexOf(":"); //index:12

        System.out.println(searchResult.substring(colonIndex+1));   //12345

        System.out.println("------------------------");


        String searchResultTwo = " username:oscar search count:12345 more: colon ";
        int firstColon = searchResultTwo.indexOf(":");      //index:9
        System.out.println("firstColon = " + firstColon);

        int secondColon = searchResultTwo.indexOf(":", firstColon+1);   //index:28
        System.out.println("secondColon = " + secondColon);

        System.out.println(searchResultTwo.substring(secondColon+1 , secondColon+6));   //12345

        System.out.println("-------------------------");

        String today = "I coded a lot of [java] today"; //

        String word = today.substring(today.indexOf("[")+1, today.indexOf("]"));
        System.out.println("word = " + word);   //word = java







    }
}

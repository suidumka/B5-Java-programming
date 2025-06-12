package H_day15;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your address here: ");
        String address = key.nextLine().trim();


        if (address.isEmpty() || address.isBlank()){
            System.out.println("No address found");
        } else  {
            String changedAddress = address.toUpperCase();
            System.out.println("Your address is: " + changedAddress);
        }
    }
}
/*
A person will enter their address into a String. Make sure the String is not empty.
        		If it is empty print: "No address found".
        		If there is an address, make all the text uppercase to match the expected format

            		Ex:
                		Input: 231332 Leaf ave, lake city 3132
                		Output: 231332 LEAF AVE, LAKE CITY 3132
            		Ex:
                		Input: ""
                		Output: No address found
 */
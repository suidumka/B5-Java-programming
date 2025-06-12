package H_day12;

import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the type of the hose to see the max allowed occupants number: ");
        String house = key.nextLine();
        int occupantsNum = 0;
        switch (house){
            case "Tree house", "tree house":
                occupantsNum = 1;
                break;
            case "Mobile home", "mobile home":
               occupantsNum = 2;
                break;
            case "Apartment", "apartment":
               occupantsNum = 4;
                break;
            case "Town house", "town house":
                occupantsNum = 6;
                break;
            case "Villa", "villa":
                occupantsNum = 8;
                break;
            case "Mansion", "mansion":
               occupantsNum = 10;
                break;
            default:
                System.out.println("Invalid enter");
        }
        switch (occupantsNum) {
            case 0:
                System.out.println();
                break;
            default:
                System.out.println("There are " + occupantsNum + " people in the " + house);
        }

    }
}
/*
Given a house type (String) print out the number of max occupants (int)

        		Tree house: 1
        		Mobile home: 2
        		Apartment: 4
        		Town house: 6
        		Villa: 8
        		Mansion: 10

            	-> Try to use variables instead of printing multiple times

		Hint: You can use switch


        	Ex:
        		Enter the type of the hose to see the max allowed occupants number.
            		Town house

            		OUTPUT:
				There are 6 people in the Town house

 */

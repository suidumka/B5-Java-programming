package H_day12;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter month number here: ");
       byte monthNum = key.nextByte();
       switch (monthNum){
           case 12,1,2:
               System.out.println("It is Winter");
               break;
           case 3,4,5:
               System.out.println("It is Spring");
               break;
           case 6,7,8:
               System.out.println("It is Summer");
               break;
           case 9,10,11:
               System.out.println("It is Fall");
               break;
           default:
               System.out.println("Invalid month number");
       }


    }
}
/*
Task:
    		add a main method

    		Given some month number determine which season it is

    		Winter: 12,1,2
    		Spring: 3,4,5
    		Summer: 6,7,8
    		Fall:   9,10,11

        	Ex:
        		when month = 2;
            		OUTPUT:
                		"Winter"

        		when month = 7;
            		OUTPUT:
                		"Summer"

 */

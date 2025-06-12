package H_day12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MorningOrNight {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time: ");
        byte time = key.nextByte();
        if (time >=0 && time <= 11){
            System.out.println("It is morning");
        } else if (time >= 12 && time <= 24) {
            System.out.println("It is night");
        } else {
            System.out.println("Invalid input");
        }                                                           // IF STATAMENT

        System.out.println("====================================");

        String timeCount;
        timeCount = (time>=0 && time<=11)? "It is MORNING": (time >= 12 && time <= 24)? "It is NIGHT": "INVALID INPUT";
        System.out.println(timeCount);
                                                                    // TERNARY

        System.out.println("====================================");


        switch (time) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11:
                System.out.println("It is MORNING");
                break;
            case 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,24:
                System.out.println("It is NIGHT");
                break;
            default:
                System.out.println("INVALID INPUT");
        }
                                                                    // SWITCH STATEMENT

    }
}

/*

        Task:
    		Given some time value (int) in 24 hours format.
    		Print if it's the morning or night.
        		0 -11 : Morning
        		12-24 : Night

        		-> You can assume the value given is always valid (in the 24 hours range), but if you want a challenge use an if to control invalid values

            		-> Try to use variables instead of printing multiple times

			Hint: You can use ternary if you can. If not, you if else or what you think is easier for you.


        	Ex:
        		Enter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time:
            		9

            		OUTPUT:
				Morning

 */
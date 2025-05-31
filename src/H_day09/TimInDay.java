package H_day09;

import java.util.Scanner;

public class TimInDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter what time is it now? (put between 0 and 24 only):");
        int timeNow = input.nextInt();
        if (timeNow >= 0 && timeNow <= 7 || timeNow == 24){
            System.out.println("GOOD NIGHT");
        }else if(timeNow >= 8 && timeNow <= 11){
            System.out.println("GOOD MORNING");
        }else if(timeNow >= 12 && timeNow <= 15){
            System.out.println("GOOD AFTERNOON");
        } else if (timeNow >= 16 && timeNow <= 23){
            System.out.println("GOOD EVENING");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
/*
	1. if hour is less than 12 noon, greet with Good Morning
        		2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        		3. if hour is greater than or equal to 3 pm, greet with Good Evening
        		4. if not in between time zone print invalid  // I added this. Was not in the question.


		Note: Use Scanner class / write all the conditions to cover all the possibilities for the different input

		Example Output:
			What time is it now (put between 0 and 24 only)?
			-1
			Invalid input!
 */
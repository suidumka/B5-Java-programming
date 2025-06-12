package H_day12;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your garde number (1-6):");
        byte grade = key.nextByte();

        if (grade >= 1 && grade <= 6) {
            System.out.println(" grade - " + grade +
                    "\nlocation -  Apple orchard" +
                    "\nnumber of groups - " + grade +
                    "\nteacher in charge - Ms. Smith");
        }
        else {
            System.out.println("Grade must be between 1-6");
        }
    }
}
/*

             	Your school goes on a Field trip each year.
		The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip.
		Print the information at the end.

               	declare and assign the grade level variable

                only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
                            so print: "Grade must be between 1-6"

                        Data based on grade:
                            grade - 1
                            location -  Apple orchard
                            number of groups - 3
                            teacher in charge - Ms. Smith

 */
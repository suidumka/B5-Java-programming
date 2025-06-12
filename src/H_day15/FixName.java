package H_day15;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter your first name here: ");
        String firstName1= key.nextLine().trim().toUpperCase();

        System.out.print("Enter your last name here: ");
        String lastName1 = key.nextLine().trim().toUpperCase();


        String correctFirstName = Character.toUpperCase(firstName1.charAt(0)) + firstName1.substring(1).toLowerCase(); // FIRST OPTION
        String correctLastName = lastName1.charAt(0) + lastName1.substring(1).toLowerCase(); // SECOND OPTION


        System.out.println("Your full name is: " + correctLastName + " " + correctFirstName);

    }
}
/*
 Given a enters first name and then last name

		Fix to print proper name:
        		capital first letter, the rest of the letter lowercase,  no extra space

          	Ex:
			Enter your first name
			jaMES
			"Enter your last name"
			boND

			Output:
				Your full name: James Bond
 */
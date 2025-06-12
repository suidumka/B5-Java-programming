package H_day15;

import java.util.Scanner;

public class WordFile {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter your first name here: ");
        String firstName1= key.nextLine().trim();

        System.out.print("Enter your last name here: ");
        String lastName1 = key.nextLine().trim();

        System.out.println("Enter which of the following options you would like to do?: 1 / 2 /3:\n " +
                "\t\t1. Make all UPPER case\n" +
                "\t\t2. make all lower case\n" +
                "\t\t3. Make Each Word Capitalized");
        byte option = key.nextByte();

        if (option == 1){
            System.out.println(firstName1.toUpperCase() + " " + lastName1.toUpperCase());
        } else if (option == 2) {
            System.out.println(firstName1.toLowerCase() + " " + lastName1.toLowerCase());
        } else if (option == 3) {
            String correctName = Character.toUpperCase(firstName1.charAt(0)) + firstName1.substring(1).toLowerCase();
            String correctLastName = Character.toUpperCase(lastName1.charAt(0)) + lastName1.substring(1).toLowerCase();
            System.out.println(correctName + " " + correctLastName);
        } else {
            System.out.println("Invalid input");
        }

    }
}
/*

		Ask a user to give a full name
            	Then ask a user
                	Which od the following options you would like to do?
                    		1. Make all UPPER case
                    		2. Make all lower case
                    		3. Make each word capitalized

                    		You option: 1, 2, 3

                 	Then print out what user gave you as full name in the option they selected

 */
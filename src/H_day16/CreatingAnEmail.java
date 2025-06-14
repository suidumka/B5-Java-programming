package H_day16;

import java.util.Scanner;
import java.util.SplittableRandom;

public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your 2 separate words here, each must contain 6 characters:");
        String word1 = key.nextLine().toLowerCase().trim();
        String word2 = key.nextLine().toLowerCase().trim();

        String email = "" +  word1.substring(0,4) + word2.substring(word2.length()-3);

        if (word1.length() < 6 || word2.length() <6){
            System.out.println("Invalid data.");
        } else if (word1.length() >= 6  || word2.length() >= 6) {
            String emailAddress = email + "@loopcamp.io";
            System.out.println("You created a new email address: " + emailAddress);
        }else {
            System.out.println("System error");
        }


    }
}
/*
	Ask user to enter two strings.

    		Both strings should be at least 6 character long.
        		If they are shorter than that
            			print “Invalid data” and program should end.
        		If the information provided is valid,
            			you will take the first 4 characters of first string and combine them with the last three characters of the second string.

        		At the end of your combined string
            			add “@loopcamp.io” and print the final string as your created email.

        		The final email should be in all lowercase.

        		input: JamesBond Secret
        		output: jameret@loopcamp.io

 */
package H_day12;

import java.util.Scanner;

public class CharUpperCaseLowerCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter letter to be converted: ");
        String input = key.next();
        char letter = input.charAt(0); // get the first character of entered value


        if (letter >= 'A' && letter <= 'Z') {
            letter +=32;
            System.out.println(letter);
        } else if (letter >= 'a' && letter <= 'z') {
            letter -=32;
            System.out.println(letter);
        }
        else {
            System.out.println("Invalid enter");
        }

//        System.out.println(letter);
    }
}
/*
Task:
    		Given a letter (char) determine if the character is an
    		uppercase letter or lowercase letter

        	Note: 	'b'  --> lowercase
            		'G' --> uppercase
            		'O'  --> uppercase

            		Hint: 	Use the ASCII table.
			      	Also, note that there is a different of 32 between upper case and lower case

				There is a 32 difference between upper and lower cases. lowercase = uppercase + 32;
        			Also, the range for uppercase is from 65 (inclusive) to 90 (inclusive), for
        			 lowercase it is from 97 (inclusive) to 122 (inclusive)


        	Ex:
        		Enter letter to be converted:
            		A

            		OUTPUT:
                		a

 */

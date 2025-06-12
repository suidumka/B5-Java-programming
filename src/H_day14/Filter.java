package H_day14;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a message here: ");
        String message = key.nextLine();
        boolean badPhrases;

        if (message.contains("java is bad") || message.contains("quit")||
                message.contains("have fun") || message.contains("crying")){
            System.out.println("Message failed to send");
        }else {
            System.out.println(message.trim());
        }

    }
}
/*
 Task:

    		Ask the user to enter a message
    		Clean the message for empty spaces in the beginning and end
    		Check the message for bad phrases:

			Ex Bad phrases are:
        			java is bad
        			quit
        			have fun
        			crying


		if there is a bad phrase in the message print:

        		message failed to send

    		otherwise print:

			$message sent

 */
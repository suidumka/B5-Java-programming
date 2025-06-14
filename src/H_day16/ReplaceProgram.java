package H_day16;

import java.util.Scanner;

public class ReplaceProgram {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter here any message: ");
        String message = key.nextLine().toLowerCase().trim();
        System.out.print("Enter here the number of what letter replacement you want to see: ");
        byte method = key.nextByte();

        System.out.println("Your message before letter replacement: " + message);

        if (method == 1){
           message= message.replace("a", "e");
        } else if (method == 2) {
            message= message.replace("s","r");
        } else if (method == 3) {
            message= message.replace("o", "z");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Your message after letter replacement: " + message);
    }
}
/*
                 Given a String message with some text and a number (1-3) replace certain characters from the String message.

                When the number is:
                    1: replace 'a' with 'e'
                    2: replace 's' with 'r'
                    3: replace 'o' with 'z'

                    Ex:
                        message: java class is fun
                        number: 1
                        Output: jeve cless is fun

                    Ex:
                        message: java class is fun
                        number: 2
                        Output: java clarr ir fun

 */
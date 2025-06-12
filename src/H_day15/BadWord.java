package H_day15;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your text message here: ");
        String text = key.nextLine().trim().toLowerCase();

        boolean badWords = text.contains("idiot") || text.contains("heck") || text.contains("dumb");

        if (badWords) {

            System.out.println("Message not sent.");
        } else {
            System.out.println("Message sent");
        }
        }
    }

/*
Given a String variable with a message.
    		You will check if the message contains any of these bad words: “idiot, dumb, heck”

        		If the message contains any of those words print: “Message not sent”.
        		If the message is bad word free print “Message sent”
 */
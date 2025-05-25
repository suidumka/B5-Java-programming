package day09_a_scanner;

import java.util.Scanner;
/*
    Ask them to enter their favorite book
    Ask the user to enter their age (byte),
    and ask them to enter their favorite number (long),

    Print all the values from the inputs

 */

public class YourInfo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your favorite book name:");

        //key.next() --> reads only until next space
        //key.nextLine() --> can take multiple words

        //String book = key.next(); // input: Jane Eyre --> Outout will be just Jane
        String book = key.nextLine();
       // System.out.println("My favorite book is: "+book); // Please, enter your favorite book name:Book of Java

        System.out.print("Please, enter you age: ");
        byte age = key.nextByte();

        System.out.print("Pleas, enter you favorite number: ");
        long favNum = key.nextLong();


        //System.out.println();
        System.out.println("\nInfo you entered: ");
        System.out.println("\tYour favorite book is: " + book);
        System.out.println("\tYour age is: " + age );
        System.out.println("\tYour favorite number is: " + favNum);

    }
}

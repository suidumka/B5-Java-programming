package day09_a_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your first name:");
        String firstName = key.next(); // since its a single word, we used .next();
        System.out.print("Please, enter your last name:");
        String lastName = key.next();
        System.out.print("Are you employed? (True/False):");
        boolean employed = key.nextBoolean();
        System.out.print("Are you a student?(True/False):");
        boolean isStudent = key.nextBoolean();

        String infoOfThePerson = "The person with first name " + firstName +" and last name " + lastName +
                " currently is employed: " + employed + " and with student status: " + isStudent;
        System.out.println(infoOfThePerson);

    }
}

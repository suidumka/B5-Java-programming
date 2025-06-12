package H_day15;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your first name here: ");
        String firstName1= key.nextLine().trim();

        System.out.print("Enter your last name here: ");
        String lastName1 = key.nextLine().trim();

        System.out.print("Enter your first name here: ");
        String firstName2= key.nextLine().trim();

        System.out.print("Enter your last name here: ");
        String lastName2 = key.nextLine().trim();

        if (lastName2.equalsIgnoreCase(lastName1)){
            System.out.println("Two people are: Related");
        }else {
            System.out.println("Two people are: Not Related");
        }

    }
}
/*
 Given two full names check if the two people are related.
                They will be considered to be related if they have the same last name
                    Ex:
                        Input:
                            James Bond
                            Jamie Bond
                        Output:
                            Related

                        Input:James Bond
                              Alex Benji
                        Output:
                              Not Related
 */
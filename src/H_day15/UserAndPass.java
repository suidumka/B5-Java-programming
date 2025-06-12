package H_day15;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter here your username: ");
        String userName = key.nextLine().trim().toLowerCase();
        System.out.print("Enter here your password: ");
        String password = key.nextLine();

        if (password.length() <= 4) {
            System.out.println("Password cannot be less than 5 characters");
        }
        else if (password.length() >= 5) {

            if (password.contains(userName)) {
                System.out.println("Invalid password, username should not be in it");
                password = "default";
                System.out.println(userName + " " + password); // the password will automatically updated to DEFAULT

            } else {
                System.out.println("Success");
            }
        } else {
            System.out.println("Invalid input");
        }


    }
}
/*
Given a username and password verify they are valid.
                    -The password cannot be less than 5 characters
                        If it is less print: "Password cannot be less than 5 characters"
                        If it is more than or equal to 5 print: "Valid password"
                    -Also,the password should not contain the username
                        -If the password has the username in it print:
                            "Invalid password, username should not be in it"
                                Also change the password to have the value: "password"
 */
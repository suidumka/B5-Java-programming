package day10_if_statements;

import java.util.Scanner;

public class EvenOrOddWithIfStatement {
    public static void main(String[] args) {
        // Created a Scanner Object
        // Scanner key                  - > Object Reference
        // new Scanner(System.in);      - > object
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int userNumber = key.nextInt(); // 3


        boolean isEven = userNumber % 2 == 0;
        boolean isOdd = userNumber % 2 != 0;

        if (isEven) {
            System.out.println(userNumber + " is even!");
        }

        if (isOdd) {
            System.out.println(userNumber + " is odd!");
        }
    }
}

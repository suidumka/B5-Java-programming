package H_day09;

import java.util.Scanner;

public class IfStatementsOperators {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Write a boolean value (true or false):");
        boolean answer = key.nextBoolean();
        boolean opposite = !answer;
        System.out.println("The opposite of you what you put is: " + opposite);

    }
}
/*
Write a program that will accept a boolean value. Print out the opposite of the given boolean

		Ex:
			true -> false
            		false -> true


		Note: Use Scanner class and the ! (NOT) operator

		Example Output:
			Write a boolean value (true or false):
			true
			The opposite of you what you put is: false
 */
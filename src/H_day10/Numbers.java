package H_day10;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter two numbers here: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();

        if (num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2 );
        } else  {
            System.out.println(num2 + " is bigger than " + num1 );
        }

    }
}
/*

		Ask user to input two numbers
		and write a code to evaluate and check if they are equal, one which one is bigger

		Ex:
			Enter 2 number:
			5
			6
			5 is smaller than 6
 */

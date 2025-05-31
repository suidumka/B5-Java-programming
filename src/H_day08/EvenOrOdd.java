package H_day08;
/*create a Scanner object
		Ask the user to enter an int number, print if the number is even or odd as boolean values

		Ex:
    			Enter an int number
    			65

    			65 is even: false
    			65 is odd: true
 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter any number here: ");
        int num11 = input.nextInt();

        boolean isEven = num11 % 2 == 0;
        boolean isOdd = num11 % 2 != 0;

        System.out.println("The " + num11 + " is even: " + isEven);
        System.out.println("The " + num11 + " is odd: " + isOdd);

    }
}

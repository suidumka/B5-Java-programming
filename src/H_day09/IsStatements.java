package H_day09;
/*
1. IF statement is used first, when you start IF statement in your class
        after IF you should enter condition ()
2. ELSE IF // you can use it endless times, after IF is started
         after IF you should enter condition ()
3. ELSE - comes only at the end as the last option.
 */

import java.util.Scanner;

/*
Create a class called IsStatements in your Practice_Programming project and inside the day09_tasks package
        Task a: //Write an if statement that assigns 5 to x when y is equal to 20
        Task b:	//Write an if statement that sets the variable fees to 50 if the Boolean variable max is true

	    Task c: //Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100

        Task d:	//Write an if statement that prints Ideal Temp if the temp is between 70 and 80
 */

public class IsStatements {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("***** 1 *****");
        System.out.println();
        System.out.print("If your age is under 20, enter it here to get a discount:");
        int y = key.nextInt();
        if (y == 20) {
            int x = 5;
            System.out.println(x);
        } else if (y >= 0 && y < 20) {  // here you can find another options
            int x = 4;
            System.out.println("The discount amount on your ticker is $" + x);
        } else {
            System.out.println("Your ticket price is regular. Please, ask a counter.");
        }

        System.out.println("\n***** 2 *****");

        System.out.print("If you want to pick max package, enter TRUE here:");
        boolean maxPackage = key.nextBoolean();
        if (maxPackage == true) {
            int num = 50;
            System.out.println("Your maximum package fee is: $" + num);
        } else if (maxPackage == false) {
            System.out.println("There is no fee for your package");
        } else {
            System.out.println("Error");
        }

        System.out.println("\n****** 3 ******");

        System.out.println("Enter B value here: ");
        int b = key.nextInt();
        System.out.println("Enter C value here: ");
        int c = key.nextInt();
        if (b == 50 && c >= 100) {
            int a = 20;
            System.out.println("Your score is: " + a);
        } else {
            System.out.println("Game is over");
        }

        System.out.println("****** 4 ******");
        System.out.println("Please, enter the current temperature in fahrenheit here: ");
        int temperature = key.nextInt();
        if (temperature >= 70 && temperature <= 80) {
            System.out.println("The room temperature is " + temperature + " it’s Ideal Temp.");
        } else if (temperature < 70) {
            System.out.println("The room temperature is " + temperature + " it’s COLD in the room. Turn on the heater, please.");
        } else if (temperature > 80) {
            System.out.println("The room temperature is " + temperature + " it’s HOT in the room. Turn on the AC, please.");
        }
    }
}



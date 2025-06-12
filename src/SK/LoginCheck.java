package SK;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your annual salary here: ");
        double salary = key.nextDouble();
        System.out.println("Hours of working per week here: ");
        byte hours = key.nextByte();
        System.out.println("Enter your age here: ");
        byte age = key.nextByte();
        boolean isStudent = age >= 18 && age <= 25;
        double hourlyRate = salary / (hours * 52);
        System.out.println("Your annual salary is: $" + hourlyRate );

}
}
/*

In the main method, create a Scanner object and ask the user to enter their age and yearly salary.
Then ask how many hours they work per week.
Calculate the hourly rate by dividing the salary by (weeklyHours * 52) and assign that to a double variable.
Create a boolean variable that checks if the age is between 18 and 25 inclusive,
 and print whether the user is a student based on that.
 Print all the values they entered, along with their hourly rate and student status. */

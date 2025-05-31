package H_day08;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your annual salary: $");
        double salary = input.nextDouble();
        System.out.print("Enter how many hours per week you work: ");
        double hoursPerWeek = input.nextDouble();
        double result = salary / (hoursPerWeek * 52);
        System.out.println("Hourly rate of the employee is: $" + result);


    }
}


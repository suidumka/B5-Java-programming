package H_day12;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter you hourly rate here: ");
        int hourlyRate = key.nextInt();
        System.out.print("Enter your weekly hours here: ");
        int weeklyHours = key.nextInt();
        System.out.print("Enter here number of weeks: ");
        byte numOfWeek = key.nextByte();

        boolean isHourlyRate = hourlyRate > 1;
        boolean isWeeklyHours = weeklyHours > 1 && weeklyHours < 65;
        boolean isNumOfWeek = numOfWeek > 1 && numOfWeek < 52;

        if (!isHourlyRate){
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
        if (!isWeeklyHours){
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
        }
        if (!isNumOfWeek){
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        }

        if (isHourlyRate && isWeeklyHours && isNumOfWeek){
            int salary = hourlyRate * weeklyHours * numOfWeek;
            System.out.println("Your salary amount is: " +  salary);
        } else {
            System.out.println("\nPlease enter valid information to calculate your salary.");
        }





    }

    }

/*
Given the following information:

    		Check if all the inputs are valid and then calculate the salary.
        		-hourly rate cannot be negative or zero
            			-> If invalid print: Hourly Rate cannot be Negative or Zero
        		-weekly hours cannot be zero, negative or more than 65
            			-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
        		-number of weeks cannot be less than 1 and more than 52
            			-> If invalid print: Number of weeks cannot be less than 1 or greater than 52

        		Note: Equation: salary  =  hourly rate *  weekly hours * number of weeks

			Note: You need think of the cases the user put wrong input

 */

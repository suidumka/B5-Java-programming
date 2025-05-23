package Homework_day08;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year here: " );
        int year = input.nextInt();
        boolean year1 = year % 4 == 0;
        System.out.println("The " + year + " year is a Leap Year: " + year1);
    }
}

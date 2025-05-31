package H_day10;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your percentage number here: ");
        int percent = key.nextInt();
        if(percent <= 100 && percent >= 85) {
            System.out.println("A");
        } else if(percent <= 84 && percent >= 70) {
            System.out.println("B");
        } else if (percent <= 69 && percent >= 55) {
            System.out.println("C");
        } else if (percent <= 54 && percent >= 40) {
            System.out.println("A");
        } else {
            System.out.println("Failed.");
        }
    }
}
/*

        Task:
   		 create a main method

    		Write a program that will take a percentage number and given back a letter grade

        	Scale:
           		A: 100 - 85
            		B: 84 - 70
            		C: 69 - 55
            		D: 54 - 40
            		D: Below 40

        	Other values are invalid, no grade
 */
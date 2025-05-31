package H_day10;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your age here:");
        byte age = key.nextByte();
        if  (age <= 0 || age >= 120) {
            System.out.println("Invalid Entry");
        } else if (age <= 1){
            System.out.println("Infant");
        } else if (age >= 3 && age <= 5)  {
            System.out.println("Toddler");
        } else if (age >= 6 && age <= 9) {
            System.out.println("Kid");
        } else if (age >= 10 && age <=12){
            System.out.println("Pre-Teen");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >=18 && age <= 20) {
            System.out.println("Young Adult");
        } else if (age >= 21 && age <= 35) {
            System.out.println("Adult");
        } else if (age >= 36 && age <= 55) {
            System.out.println("Middle-Aged Adult");
        } else if (age >= 56 && age <= 119) {
            System.out.println("Senior Citizen");
        }
        }
}
/*

    		Write a program that can define the age groups of someone based on their given age:

    		infant (< 1 year)
    		Toddler (3 - 5)
    		Kid (6 - 9
    		Pre-Teen (10 - 12)
    		Teenager (13 - 17)
    		Young Adult (18 - 20)
    		Adult (21 - 35)
   		Middle-Aged Adult (36 - 55)
    		Senior Citizen (55+)

		Challenge: if age > 120 or less than 0 ==> invalid entry */

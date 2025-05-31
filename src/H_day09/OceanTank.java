package H_day09;

import java.util.Scanner;

public class OceanTank {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter here your oxygen level: ");
        int oxygenLevel = key.nextInt();


        if (oxygenLevel> 90){
            System.out.println("Your oxygen level is: " + oxygenLevel + "\n\tYour tank is full.");
        } else if (oxygenLevel > 80){
            System.out.println("Your oxygen level is: " + oxygenLevel + "\n\tStill okay");
        } else if (oxygenLevel >70){
            System.out.println("Your oxygen level is:" + oxygenLevel + "\n\tDon't go too far");
        }else if (oxygenLevel> 60){
            System.out.println("Your oxygen level is:" + oxygenLevel + "\n\tStart to head back");
        }else if (oxygenLevel>50){
            System.out.println("Your oxygen level is:" + oxygenLevel + "\n\tBe careful now you are at 50%");
        }else {
            System.out.println("!!!Your oxygen level is critically low. Back ASAP!!!!!!");
        }

// those 3 IF statesment below, are taken from Feyruz classes

        // BE CAREFULL with the ORDER as well.
        if (oxygenLevel > 50){
            System.out.println("Be careful now you are at 50%");
        } else if (oxygenLevel > 60){
            System.out.println("Start to head back");
        } else if (oxygenLevel > 70){
            System.out.println("Don't go too far");
        } else if (oxygenLevel > 80){
            System.out.println("Still okay");
        } else if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        }

        // SOLUTION OPTION - 1
        System.out.println("------------------------------------");
        if (oxygenLevel > 50 && oxygenLevel <= 60){
            System.out.println("Be careful now you are at 50%");
        } else if (oxygenLevel > 60 && oxygenLevel <= 70){
            System.out.println("Start to head back");
        } else if (oxygenLevel > 70 && oxygenLevel <= 80){
            System.out.println("Don't go too far");
        } else if (oxygenLevel > 80 && oxygenLevel <= 90){
            System.out.println("Still okay");
        } else if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        }


        // SOLUTION OPTION - 2
        System.out.println("------------------------------------");
        if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't go too far");
        } else if (oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you are at 50%");
        } else {
            System.out.println("See you in heaven");
        }
    }
}
/*	You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
        	> Above 90 - Your tank is full
        	> Above 80 - Still okay
        	> Above 70 - Don't go too far
        	> Above 60 - Start to head back
        	> Above 50 - Be careful now you are at 50%
		Note: Use Scanner class / write all the conditions to cover all the possibilities for the different input
		Example Output:
			What is your current oxygen level of in your tank?
			95
			You tank is full!

 */

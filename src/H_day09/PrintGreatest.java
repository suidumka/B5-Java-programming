package H_day09;

import java.util.Scanner;

public class PrintGreatest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please enter first number here:");
        int num1 = key.nextInt();
        System.out.print("Please enter second number here:");
        int num2 = key.nextInt();
        System.out.print("Please enter third number here:");
        int num3 = key.nextInt();
        if (num1 > num2 && num1 > num3){
            int max = num1;
            System.out.println("The greatest number from"+ num1 + " " + num2 + " " + num3 + " is: " + max);
        }else if (num2 > num3 && num2 > num1){
            int max = num2;
            System.out.println("The greatest number from"+ num1 + " " + num2 + " " + num3 + " is: " + max);
        }else if (num3 > num1 && num3 > num2){
            int max = num3;
            System.out.println("The greatest number from"+ num1 + " " + num2 + " " +  num3 + " is: " + max);
        }
        else {
            System.out.println("Error");
        }

    }
}
/*
Write Java program that will have three numbers and print the greatest number.
    		First number: 4
    		Second number: 8
    		Third number: 1

			Output:
        			The greatest number from 4, 8, 1 is:  8
 */

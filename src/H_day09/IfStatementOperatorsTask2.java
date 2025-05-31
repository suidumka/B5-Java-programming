package H_day09;

import java.util.Scanner;

public class IfStatementOperatorsTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your salary amount: $");
        int salary = input.nextInt();
        System.out.print("Enter here is you are full time? True / False: ");
        boolean fulltime = input.nextBoolean();
        if (fulltime == true){
            salary = salary + 20000;
            System.out.println("Your annual salary amount as a full time employee is: $"+ salary);
        } else if (fulltime == false) {
            salary = salary - 5000;
            System.out.println("Your annual salary amount as a part time employee is: $"+ salary);
        }
        else {
            System.out.println("Start it again"); // to handle the other cases
        }
    }
}

/*


    Create a class called IfStatementOperatorsTask2 in your Practice_Programming project and inside the day09_tasks package

        Task:
        	Write a program that will accept your salary amount.
    		Then also ask the user if they are full time or not (boolean).
   		If they are fulltime add 20000 to their salary,
   		but if they are part time then subtract 5000.
    		Print the final salary.

		Note: Use Scanner class (also use arithmetic operators and reassign the new values based on the true or false info)

		Example Output:
			What is you salary: $
			100000
			You are a full time employee ? (true or false):
			true
			This is you final salary: $120000


 */

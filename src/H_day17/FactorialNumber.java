package H_day17;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a number here, to calculate it's factorial result: ");
        long number = key.nextLong(); // 7
        int result = 1;
        int ii = 1;

        while (ii < number){
            result *= ii;
            ii++;
        }

        System.out.println("The factorial of " + number + " is: " + result);
    }
}
/*
FactorialNumber
                    write a program that can return the factorial number of any given number
                        Ex:
                            input: !5
                            output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
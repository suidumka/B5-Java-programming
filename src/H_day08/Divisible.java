package H_day08;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter number here:");
        int num1 = input.nextInt();
        System.out.println("The number is: " + num1);

        boolean div2 = num1 % 2 == 0;
        boolean div3 = num1 % 3 == 0;
        boolean div5 = num1 % 5 == 0;
        System.out.println("The number " + num1 + " is divisible by 2: " +div2);
        System.out.println("The number " + num1 + " is divisible by 3: " +div3);
        System.out.println("The number " + num1 + " is divisible by 5: " +div5);



    }
}

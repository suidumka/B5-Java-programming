package H_day08;

import java.util.Scanner;

public class PersonInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your age: ");
        byte age = input.nextByte();
        System.out.print("Please, enter your favorite number: ");
        long number = input.nextLong();

        boolean result = age >= 18 && age <= 25;
        System.out.println("You are a student: " + result);


    }
}

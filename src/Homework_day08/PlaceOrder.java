package Homework_day08;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the product name: ");
        String product_name = input.nextLine();
        System.out.print("Enter the price: $");
        double price = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        double totalCost = price * quantity;
        input.nextLine();
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your second name:");
        String secondName = input.nextLine();
        String fullName = firstName + " " + secondName;
        System.out.println();
        System.out.println(fullName + ", your order for " + quantity +" " + product_name +
                " has been placed. \nYour total is $" + totalCost );

    }
}

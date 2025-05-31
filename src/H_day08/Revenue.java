package H_day08;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price:$");
        int price = input.nextInt();
        System.out.print("Enter the quantity:");
        int quantity = input.nextInt();
        int revenue = price * quantity;
        System.out.println("Revenue: $" + revenue);

    }
}

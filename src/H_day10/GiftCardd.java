package H_day10;

import java.util.Scanner;

public class GiftCardd {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int currentBalance = 100;
        int price = 0;
        System.out.println("List of items: \n1.\tBlanket - 60$ \n2.\tCharger - 25$ \n3.\tHat - 25$ \n4.\tHeadphones - " +
                "30$ \n5.\tLaptop - 200$ \n6.\tPants - 50$ \n7.\tPillow - 40$ " +
                "\n8.\tSmartphone - 1000$ \n9.\tSocks - 5$ \n10.\tUSB cable - 10$");
        System.out.print("Enter the number of the item you want to purchase: ");
        int itemNum = key.nextInt();

        if(itemNum == 1) {
            price = 60;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\n\"Your current balance is:\" $" + currentBalance);
        }
        else if (itemNum == 2) {
            price = 25;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\n\"Your current balance is:\" $" + currentBalance);
        }
        else if (itemNum == 3) {
            price = 25;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\n\"Your current balance is:\" $" + currentBalance);
        }
        else if (itemNum == 4) {
            price = 30;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\nYour current balance is: $" + currentBalance);
        }
        else if (itemNum == 5) {
            price = 200;
            if (price > currentBalance) {
                System.out.println("Sorry, not enough funds on your gift card!" +
                        "\n \"Your current balance is:\" $" + currentBalance);
            }
        }
        else if (itemNum == 6) {
            price = 50;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\n\"Your current balance is:\" $" + currentBalance);
        }
        else if (itemNum == 7) {
            price = 40;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\nYour current balance is: $" + currentBalance);
        }
        else if (itemNum == 8) {
            price = 10;
            if (price > currentBalance) {
                System.out.println("Sorry, not enough funds on your gift card!" +
                        "\nYour current balance is: $" + currentBalance);
            }
            else {
                System.out.println("ovnjfdnf");
            }
        }
        else if (itemNum == 9 ) {
            price = 5;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\n\"Your current balance is:\" $" + currentBalance);
        }
        else if (itemNum == 10) {
            price = 10;
            currentBalance -= price;
            System.out.println("\"Thank you for your purchase!" +
                    "\n\"Your current balance is:\" $" + currentBalance);
        }
        else  {
            System.out.println("Invalid item!");
        }


    }
}

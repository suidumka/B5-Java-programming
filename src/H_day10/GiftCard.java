//package H_day10;
//
//import java.util.Scanner;
//
//public class GiftCard {
//    public static void main(String[] args) {
//        Scanner key = new Scanner(System.in);
//        System.out.print("Your current balance of the gift card is: $100");
//        int amountInYourGiftCard = 100;
//        int price = 0;
//        boolean validItem = true;
//
//        System.out.print("\nThe items you can buy: \n\t\tBlanket - $60 \n\t\tCharger - $25 " +
//                "\n\t\tHat - $25 \n\t\tHeadphones - $30 \n\t\tLaptop - $200" +
//                "\n\t\tPants - $50\n\t\tPillow - $40\n\t\tSmartphone - $1000\n\t\tSocks - $5\n\t\tUSB cable - $10");
//
//        System.out.print("\nEnter item name here you want to buy here: ");
//        String pickTheItem = key.nextLine();
//
//        if (pickTheItem.equals("blanket")) {
//            price = 60;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("charger")) {
//            price = 25;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("hat")) {
//            price = 25;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("headphones")) {
//            price = 30;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("laptop")) {
//            price = 200;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("pants")) {
//            price = 50;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("pillow")) {
//            price = 40;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("smartphone")) {
//            price = 1000;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("socks")) {
//            price = 5;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        } else if (pickTheItem.equals("USB cable")) {
//            price = 10;
//            amountInYourGiftCard = amountInYourGiftCard - price;
//            System.out.println("Thank you for your purchase!\n" +
//                    "Your current balance is: " + amountInYourGiftCard);
//        }  else if (price > amountInYourGiftCard) {
//            System.out.println("Sorry, not enough funds on your gift card!");
//        } else {
//            validItem = false;
//            System.out.println("Invalid Item!");
//        }
//
//    }
//}
///*
//	Let's say I've got a 100$ gift card and you want to buy something in your online store .
//	 Write a program that will help me to buy something and display leftover balance after purchase.
//
//		If item is not in the list, display message: "Invalid item!".
//		If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
//		List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$
//		Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$
//
//		Hint: if/ else if / else or switch statement
//
//		Examples:
//
//		input: Hat
//		output:
//			Thank you for your purchase!
//			Your current balance is: 75$
//
//		input: Pants
//		output:
//			Thank you for your purchase!
//			Your current balance is: 50$
//
//		input: Laptop
//		Output:
//			Sorry, not enough funds on your gift card!
//
//		input: Cupcake
//		output: Invalid item!
//
// */
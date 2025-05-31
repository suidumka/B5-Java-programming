package H_day10;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your budget here: $ ");
        int budget = key.nextInt();
        if (budget < 0) {
            System.out.print("That is not a valid budget.");
        } else if (budget >= 300000) {
            System.out.println("Too much money for this agency.");
        } else {
            if (budget >= 80000 && budget <= 100000) {
                System.out.println("We can offer \"Hills neighbourhood\":\n" +
                        "\naverage price - 80,000 - 100,000\n" +
                        "            \t\trating - 4.0\n" +
                        "            \t\tgated - no\n" +
                        "            \t\tallow pets - yes");
            } else if (budget >= 55000 && budget <= 75000) {
                System.out.println("We can offer \"Oaks neighbourhood\":\n" +
                        "           \t\taverage price - 55,000 - 75,000\n" +
                        "            \t\trating - 3.5\n" +
                        "            \t\tgated - no\n" +
                        "            \t\tallow pets - yes");
            } else if (budget >= 120000 && budget <= 150000) {
                System.out.println("We can offer \"Highland neighbourhood\":\n" +
                        "            \t\taverage price - 120,000 - 150,000\n" +
                        "            \t\trating - 4.5\n" +
                        "            \t\tgated - yes\n" +
                        "            \t\tallow pets - no");

            } else if (budget >= 160000 && budget <= 201000) {
                System.out.println("We can offer \"Canyon neighbourhood\":\n" +
                        "            \t\taverage price - 160,000 - 201,000\n" +
                        "            \t\trating - 4.8\n" +
                        "            \t\tgated - yes\n" +
                        "            \t\tallow pets - yes");
            } else {
                System.out.println("No available houses");
            }
        }
    }
}

/*
          We are buying a house
        	ask the user for their budget (single number, max)

        	Find the area that the user's budget fits into and provide all the information of the neighborhood



        	Data based on neighborhood name:

            		name - Oaks
           		average price - 55,000 - 75,000
            		rating - 3.5
            		gated - no
            		allow pets - yes

            		b

            		name - Canyon
            		average price - 160,000 - 201,000
            		rating - 4.8
            		gated - yes
            		allow pets - yes

            		If the budget is no in any range print: "No available houses"


 */

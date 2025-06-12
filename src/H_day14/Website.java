package H_day14;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter here website name: ");
        String website = key.next();

        boolean webStartsWith = website.startsWith("https://www.") || website.startsWith("www.");
        boolean webEndsWith = website.endsWith(".io") || website.endsWith(".org") || website.endsWith(".gov") ||
                website.endsWith("net") || website.endsWith("com");
        boolean noSpaceInUrl = !website.contains(" ");

        if (webStartsWith && noSpaceInUrl && webEndsWith) {
            System.out.println("The link format is entered correctly!");
        } else {
            if (!webStartsWith) {
                System.out.println("Beginning is not correct. Ex: https://www. ");
            }

            if (!webEndsWith) {
                System.out.println("Ending is not correct. Ex: .io / .org / .gov / .net");
            }

            if (!noSpaceInUrl) {
                System.out.println("Website can not contain a space. Try again.");
            }
        }
    }
}

/*

    		Ask the user to enter a website
    		check if it is a valid website

			- it is valid if it begins with:
				https://www.

			- it is valid if the end is:
				.io
				.org
				.gov
				.net

      			-in cases it is not valid, tell the reason why

 */
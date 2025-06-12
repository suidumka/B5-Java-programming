package H_day12;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("What is your name ?");
        String name = key.nextLine();
        System.out.println(name);

        System.out.print("How many people you live with?: ");
        byte peopleLiveWith = key.nextByte();
        if (peopleLiveWith <= 2) {
            System.out.println(name + " lives with less 2 people");
        } else if (peopleLiveWith >= 3 && peopleLiveWith <= 6) {
            System.out.println(name + " lives with 3–6 people");
        } else if (peopleLiveWith > 6) {
            System.out.println(name + " lives with more than 6 people");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Do live in downtown? (True / False): ");
        boolean livesInCity = key.nextBoolean();
        key.nextLine();

        if (livesInCity == true) {
            System.out.print(name + " what city do you live in?: ");
            String cityName = key.nextLine();
            System.out.println(name + " lives in " + cityName);
            System.out.print(name + " have you thought about moving to the suburbs?: ");
            String moveToSuburb = key.nextLine();

            switch (moveToSuburb) {
                case "yes":
                    System.out.println("Do it. Its great");
                    break;
                case "no":
                    System.out.println("You should think about it");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        } else if (livesInCity != true) {
            System.out.println("It is good, to live in suburb. Glad for you.");
        } else {
            System.out.println("Invalid input.");
        }

        System.out.print(name + " enter here your favorite animal?: ");
        String animal = key.nextLine();
        System.out.print(name + " how many pets would you like to have?: ");
        int amountOfPets = key.nextInt();

        key.nextLine();


        System.out.println("WOW " + animal + (amountOfPets >1? "s" : "") + " is a great animal.");


        System.out.println("Interesting, do you want " + amountOfPets + " " + animal + (amountOfPets>1? "s" : "") + " ?");

    }
}
/*
        		if the user lives with more than 6 people:
            			print "Live with "more than 6 people"
    		Ask the user what city they live in?
    		Ask the user if they live in downtown ("yes or no")
        		if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            			if they have thought about it print "Do it its great",
            			if they have not print "You should think about it"
    		Ask the user their favorite animal?
        		Print "Wow %animal is a great animal"
        		Ask the user how many pets they want?
        		Print "Interesting, do you want %numberOfPets %favoriteAnimals?"


			Note: You need think of the cases the user put wrong input

        	Ex:
        		What is your name:
            		Tom
			How many people do you live with?
			2
`			Tom lives with less than 2 people.
			What city do you live in?
			Fairfax
			Do you live in downtown of Fairfax? (yes or no)
			Yes
			Have you thought about moving to the suburbs? (yes or no)
			Yes
			Do it. Its great
			What is your favorite animal?
			Horse
			Wow Horse is great animal.
			How many Horse would you like have?
			10
			Interesting, you want 10 Horses


            		OUTPUT:
				There was COVID-19



 */

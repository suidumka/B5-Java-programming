package Homework_day05;

public class House {
    public static void main(String[] args) {
        String house_type = "Town house";
        byte  number_of_bedrooms = 4, number_of_bathrooms = 5, number_of_kitchens = 1;
        String is_there_a_basement = "yes", is_there_an_attic = "no", is_there_a_pool = "yes", is_the_house_for_sale = "yes";
        int cost_of_the_house = 5200000, zipcode = 26778;
        String address = "2110 Blue Ridge Rd, Raleigh, NC";
        boolean park_is_nearby = true;
        String Rating = "5*/5*";
        System.out.println("Type of the house:\t\t" + house_type + "\nNumber of bedrooms:\t\t" + number_of_bedrooms +
                "\nNumber of bathrooms:\t" + number_of_bathrooms + "\nNumber of kitchens:\t\t" + number_of_kitchens +
                "\nIs there basement:\t\t" + is_there_a_basement + "\nIs there attic:\t\t\t" + is_there_an_attic +
                "\nIs there pool:\t\t\t" + is_there_a_pool + "\nIs the house for sale?:\t" + is_the_house_for_sale +
                "\nThe cost is:\t\t\t" + cost_of_the_house + "\nAddress:\t\t\t\t" + address + " " + zipcode +
                "\nIs there park nearby?:\t" + park_is_nearby + "\n\nRating of surrounding school districts: " + Rating);


        System.out.println("--------------------------------------------------------------------------");

        // this printout version more readinble and reusable.


        String allInfo = "Type of the house:\t\t" + house_type + "\nNumber of bedrooms:\t\t" + number_of_bedrooms +
                "\nNumber of bathrooms:\t" + number_of_bathrooms + "\nNumber of kitchens:\t\t" + number_of_kitchens +
                "\nIs there basement:\t\t" + is_there_a_basement + "\nIs there attic:\t\t\t" + is_there_an_attic +
                "\nIs there pool:\t\t\t" + is_there_a_pool + "\nIs the house for sale?:\t" + is_the_house_for_sale +
                "\nThe cost is:\t\t\t" + cost_of_the_house + "\nAddress:\t\t\t\t" + address + " " + zipcode +
                "\nIs there park nearby?:\t" + park_is_nearby + "\n\nRating of surrounding school districts: " + Rating;

        System.out.println(allInfo);





    }
}

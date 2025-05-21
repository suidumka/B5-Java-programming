package Homework_day06;

public class TicketPrice {
    public static void main(String[] args) {

        String city = "Chicago";
        String city2 = "Virginia";
        double base_ticket_price = 110.50;
        double miles_between_cities = 739.80;
        double ticket_price = base_ticket_price + (miles_between_cities / 10);

        System.out.println("\nThe ticket price from " + city + " to " + city2 + " is " + ticket_price);
    }
}

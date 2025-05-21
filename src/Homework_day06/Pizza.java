package Homework_day06;

public class Pizza {
    public static void main(String[] args) {

        String pizza = "Cheese pizza";
        byte pizza_slices = 8;
        byte people = 4;
        int slices_per_person = pizza_slices / people;
        System.out.println("\nWe ordered " + pizza + " with " + pizza_slices  + " slices" +
                ", " + people + " people ate " + slices_per_person + " slices each.");
    }
}

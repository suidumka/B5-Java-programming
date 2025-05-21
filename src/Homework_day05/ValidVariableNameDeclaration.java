package Homework_day05;

public class ValidVariableNameDeclaration {
    public static void main(String[] args) {
        int $cost_of_eggs_in_America = 12;
        // int #cost_of_milk_ = 5;   // only 2 special characters $ and _ are allowed to use
        int cost____$$$$12456789WATER = 7;

        System.out.println("A dozen of eggs in America costs $" + $cost_of_eggs_in_America);
        System.out.println("One pack of water, 40 count inside costs $" + cost____$$$$12456789WATER);
    }
}

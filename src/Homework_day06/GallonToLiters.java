package Homework_day06;

public class GallonToLiters {
    public static void main(String[] args) {

        double gallon = 10;
        double liter = 37.8541;
        double gal_to_lt = liter / gallon; // 1 gallon to liters

        double gallon_new = 9;
        double lt_to_gal = gallon_new * gal_to_lt;

        System.out.println(gallon_new + " gallon is equal to " + lt_to_gal + " liters");
    }
}

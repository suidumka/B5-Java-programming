package Homework_day04;

public class PrintDate {
    public static void main(String[] args) {
        int month = 05;
        int day = 25;
        int year = 2025;

        System.out.println("Today is " + month + "/" + day + "/" + year);
        System.out.println("Today is " + month + "_" + day + "_" + year);
        System.out.println("Today is " + month + "-" + day + "-" + year);
        System.out.println("Today is " + month + "|" + day + "|" + year);
        System.out.println("Today is " + month + "<>" + day + "<>" + year);
    }
}

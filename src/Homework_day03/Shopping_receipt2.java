package Homework_day03;

public class Shopping_receipt2 {
    public static void main(String[] args) {
        byte cake = 24;
        double water = 3.99;
        double apple = 7.50;
        double bread = 4.25;
        double total = cake + water + apple + bread;
        double tax = 3.90;
        double grand_total = total + tax;
        System.out.println("****************************\n\tWELCOME TO THE STORE\n****************************\n");
        System.out.println("-------------------------\n");
        System.out.println("Cake              $" + cake);
        System.out.println("Water             $" + water);
        System.out.println("Apple Juice       $" + apple);
        System.out.println("Bread             $" + bread);
        System.out.println("\n-------------------------");
        System.out.println("TOTAL AMOUNT:     $" + total);
        System.out.println("TAX:              $" + tax);
        System.out.println("\nGRAND TOTAL:      $" + grand_total);
        System.out.println("-------------------------\n*******THANK YOU*********");
    }
}

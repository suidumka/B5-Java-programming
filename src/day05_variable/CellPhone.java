package day05_variable;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone 25Pro";
        String color = "black"; // yellow, white,grey
        // If the data type is same, like String, Int, Double, but different values, we can do it one line
        // in this case: String brand = "apple", model = "Iphone", color = "Black";

        double price = 1100.99;
        int storage = 512;
        boolean hasCamera = true;
        char simCard = 'A';

        System.out.println("I have an " + model + " from " + brand + ".");
        System.out.println("It came with " + color + " and with storage of " + storage + "GB");
        System.out.println("I paid only " + price + ", sim type is " + simCard + " with the camera: " + hasCamera);

    }
}

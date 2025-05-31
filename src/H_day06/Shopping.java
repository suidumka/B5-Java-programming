package H_day06;

public class Shopping {
    public static void main(String[] args) {
        int numOfItems = 0;
        double price = 0.0;

        System.out.println("I have " + numOfItems + " items in the cart. ");
        System.out.println("I picked up 1 pack of water ");
        System.out.println("How many items in the cart: " + ++numOfItems);
        price = price + 2.5;
        System.out.println("I picked up 2 pack of eggs");
        System.out.println("How many items in the cart: " + ++numOfItems);
        System.out.println("How many items in the cart: " + ++numOfItems);

    }
}

package Homework_day06;

public class GiftCard {
    public static void main(String[] args) {
        int giftcard_balance = 200;
        int item1_price = 40;
        int item2_price = 100;
        int remain_balance =  giftcard_balance - item1_price - item2_price;

        System.out.println("The gift card started with a balance of $" + giftcard_balance +
                " \nand after buying 1 item for $" + item1_price + " \nand 2nd item for $" + item2_price +
                " \nthe remaining balance of the gift card is $" + remain_balance);
    }
}

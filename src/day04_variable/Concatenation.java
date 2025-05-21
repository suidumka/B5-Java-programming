package day04_variable;

import java.security.spec.RSAOtherPrimeInfo;

public class Concatenation {
    public static void main(String[] args) {
        int apple = 80;
        int grape = 100;
        int bananas = 150;


        System.out.println("This is how many apples we have " + apple); //Hard coding - static value
        System.out.println("I have sold 50 apples.");
        apple = 80 - 50; // reassigning new value;
        System.out.println("This is how many apples left " + apple);

        int applePrice = 15;
        // The price of my 30 apples is 15$ // Hardcoded way used the data
        // System.out.println("The price of my 30 apples is 15$");
        System.out.println("The price of my " + apple + " apples is " + applePrice + "$"); // dynamically used code


        System.out.println("\nThis is how many grape we have " + grape);
        System.out.println("This is how many bananas we have " + bananas);

        //CONCATENATION -> after first double quote, everything, whatever you write will be shown in letters
       //  System.out.println("" + whatever you write will be shown in letters);
        // After concatenation (including concatenation) --> everything becomes LETTER data type (String)
        System.out.println("" + 10 + 10); // 1010
        System.out.println(10 + 10 + "" + 10 + 10); // 201010
        System.out.println("" + 10 + 10 + "" + 10 + 10); // 10101010
        System.out.println("ab" + 10 + 10 + "" + 10 + 10); // ab10101010
        System.out.println("ab" + 10 + 10 + "  " + 10 +10); // ab1010 1010
        System.out.println(10 + 10 + " " + 10 + 10); // 20 1010
        System.out.println("" + 10 + 10 + " here " + 10 + 10); // 1010 here 1010
        System.out.println(4+ (5+ "Hello")); // 45Hello
        System.out.println("Hello" +4 +5); // Hello45


    }
}


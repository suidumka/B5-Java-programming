package H_day16;

import java.util.Scanner;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter 2 words here:");
        String word1 = key.next();
        String word2 = key.next();

        String output1 = word1.substring(1).toLowerCase().trim();
        String output2 = word2.substring(0,word2.length() -1).toLowerCase().trim();

        System.out.println(output1 + " \n" + output2);

    }
}
/*
Task:
   Given two words. Print the first word without its first character then print the second word without its last character.

                    Input:
                        apple banana
                    Output:
                        pple
                        banan

 */
package day10_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temperature = key.nextInt();

        if (temperature >= 70){
            System.out.println("Its 70 F");
        }
        else {
            System.out.println("Its less than 70 F");
        }
    }
}

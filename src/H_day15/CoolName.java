package H_day15;

import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your name here, to check if it is cool: ");
        String name = key.nextLine().trim().toUpperCase();

        if(name.startsWith("A") || name.startsWith("Z")) {
            System.out.println(name + " your name is cool");
        } else if (name.endsWith("M")){
            System.out.println(name + " your name is almost cool");
        }else {
            System.out.println(name + " sorry not a cool name");
        }

    }
}
/*
Declare a variable name. You will check if it is a cool name.
        		-If the name begins with an ‘a’ or ‘z’ print “Your name is cool”
        		-If the name ends with 'm' print "Almost cool"
        		-Otherwise print “Sorry not a cool name”
 */
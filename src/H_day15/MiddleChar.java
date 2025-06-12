package H_day15;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter name here: ");
        String name = key.nextLine();

        if (name.length() %2==0){
            int name1 = name.length() /2;
            System.out.println("The middle characters: "  +  name.charAt(name1 -1) + name.charAt(name1));
        }
        else {
            int name1 = name.length() /2 + 1;
            System.out.println("The middle characters: " + name.charAt(name1 -1));

        }
    }
}

/*
name.length = num
num %2==0;
if
even +1
odd
 */
// length (5) %2 == 0 >> even
//length (5) %2 != 0 >> odd

// L E Y L A  >> 5  >> 3



/*
 Given a String, write a program to display the middle character of a string

                a) If the length of the string is even there will be two middle characters.
                b) If the length of the string is odd there will be one middle character.
                    Ex:
                        Input: elephant
                        Output: The middle characters: ph
 */
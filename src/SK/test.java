package SK;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//       int num1 = 15;
//       int num2 = 30;
//       int num3 = 35;
//       Scanner key = new Scanner(System.in);
//        System.out.print("Enter the number here please: ");
//       int num5 = key.nextInt();
//       if (num5 %2 == 0){
//           System.out.println("it is even");
//       } else
//       {
//           System.out.println("it is odd");
//       }

        String name = " Tom and J";
                   //  0123456789
        System.out.println(name.substring(4));
        System.out.println(name.trim());
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase(Locale.ROOT));

        System.out.println("----");
        System.out.println(name.trim());
        System.out.println(name.replace("T","B"));
        System.out.println(name.equals("t12345678ry"));
    }
}

//#1 -  "".length(); this will give us the number of the total characters
//#2 - "".equals(""); ---- > compares the value (exact characters)
// #3 - "".toUpperCase(); -- >  converts the String to ALL UPPERCASE and returns String
// #4 - "".equalsIgnoreCase(""); --> compares the value (characters without case sensitiveness)
// #5 - "".toLowerCase(); -- >  converts the String to all lowercase and returns String
//#6 - "".startsWith(""); --> will check if start or not with exact match - it returns true/false
// #7 - "".endsWith(""); will check if ends or not with exact match - returns boolean
// #8 - "".contains(""); --> will check if exact ("") is in anywhere in the "". If yes, returns TRUE, if not FALSE
// #9 - "".trim(); - removes the empty spaces from the beginning and end.
// #10-	"".isEmpty(); -checks if String is empty and returns boolean. 	--- > "";
//#11- "".isBlank(); -checks if String has ONLY EMPTY(blank) SPACES and return boolean		--- > "   ";  	/   "";
// 12- "".charAt(int/index) -gives a char based on the given number at String index - returns char

// #15 - "".substring(); --- > take the portion of the string and returns string

// TODO: check if last 2 characters are same or not? -- > loop

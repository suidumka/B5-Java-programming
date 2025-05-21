package day03_comments_escape_sequence;

public class EscapeSequenceQuote {
    public static void main(String[] args) {
        /*
            Q: To print out double quotes itself:
            answer:
            - ESCAPE SEQUENCE ------>
            \ -> backward slash
            / -> forward slash
           */
        System.out.println("Programming language \"Java\" is the great one!");

        /*
            Q: To print out backward slash itself:
            EX: 05\10\2025
            answer:
            Put backward slash twice, like '05\\10\\2025'
         */

        System.out.println("Today is 05/10/2025");
        System.out.println("Today is 05\\10\\2025");  // I use 2 backward slashes '\\'
        System.out.println("Today is 05.10.2025");
        System.out.println("Today is 05\\\\10\\\\2025"); // Here I will see only 2 backward slashes
        System.out.println("Today is 05\'10\'2025"); // Here backward slash is redundant (means not needed)
        System.out.println("Today is 05'10'2025");  // this one is correct





    }
}

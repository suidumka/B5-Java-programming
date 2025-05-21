package day03_comments_escape_sequence;

public class EscapeSequenceTabANDNextLine {
    public static void main(String[] args) {

        // \t -> is for tab
        System.out.println("This is not tabbed");
        System.out.println("    This is not tabbed"); // I put 4 spaces in the beginning
        System.out.println("        This is not tabbed"); // I put 8 spaces in the beginning
        System.out.println("\tThis is not tabbed");   // \t - 1 tab equals 4 spaces
        System.out.println("\t\tThis is not tabbed");
        System.out.println("u\t\tThis is not tabbed");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();



        // \n -> is for next line

        System.out.print("This is all about NEW LINE with ESCAPE SEQUENCE. \nHere we use escape sequence");
        //System.out.println ("Here we used escape sequence");
        System.out.println("\nNew Line");

    }
}

package day06_a_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

        // If we have 2 data types (int and double), the system will accept the biggest BY DEFAULT
        // In this case double is bigger than int double > int.
        // So the print out will be in decimal, not whole number
        int num1 = 40;
        float num2 = num1; // float > int
        System.out.println(num1); // 40
        System.out.println(num2); // 40.0


        float num3 = 50.5f;
        short num4 = (short)num3; // float > short
        System.out.println(num3); // 50.5
        System.out.println(num4); // 50


        float num5 = 50.75f;
        byte num6 = (byte)num5; // float > byte
        System.out.println(num5); // 50.35
        System.out.println(num6); // 50

        System.out.println("-----------------------");
        char letter1 = 'f';
        int letterInt = letter1; // Because the in ASCCI table, for each char we have a number assigned to it. | int > char --> IMPLICIT CASTING
        System.out.println(letter1);
        System.out.println(letterInt);

        System.out.println('B');
        System.out.println((int)'B');

        System.out.println();
    }
}

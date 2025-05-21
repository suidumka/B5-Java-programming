package day05_variable;
/*
Variable Naming Conventions
        hell1@      - NO OK - this @ special character is not allowed in variable names
        12test      - NO OK - cannot start number. Number can be anywhere except beginning
        $public     - OK    - $ is allowed special character
        _34hello    - OK    - _ is allowed special character
        staticTest  - OK    - staticTest is a valid variable name. "static" is not allowed alone
        Package     - OK    - since it is with capital P we can but "package" is not allowed

        - camelCase
        - any letters including upper or lower case
        - any number can be anywhere EXCEPT beginning
        - 2 special characters allowed anywhere --- > $, _ (no other special characters)

*/


public class RecapVariables {
    public static void main(String[] args) {

        // Declare variables
        byte numOfCoffeeCups;
        double totalPrice;
        int numOfStudents;

        // We can not use the container / variable if it has not value assigned
        //  System.out.println(numOfCoffeeCups);

        // Assign initial values / initialize variables
        numOfCoffeeCups = 10;
        totalPrice = 18.99;
        numOfStudents = 15;

        System.out.println(numOfCoffeeCups);
        System.out.println(totalPrice);
        System.out.println(numOfStudents);

        // Printout in this exact format: numOfCoffeeCups * numOfStudents
        System.out.println(numOfCoffeeCups + " * " + numOfStudents); // CONCATENATION


        // DECLARE & ASSIGN value directly
        // = --> assignment operator
        // . --> dot operator
        // datatype varName = value;

        double temperature = 75.5;
        float earthDiameter = 1274243534.34f; // just a sample. May not be correct info

        System.out.println("Today the temperatures was " + temperature + " degrees Fahrenheit");  // using data dynamically
        System.out.println("Earth's diameter is " + earthDiameter + " km");  // using data dynamically


        // We can assign ONE variable to another variable based on which one can hold which
        // byte < short < int < long < float < double

        byte b = 10;
        System.out.println(b);


        short s;
        s = b;
        System.out.println(s);

        int i;
        i = b;
        i = s;
        System.out.println(i);

        long l;
        l = b;
        l = s;
        l = i;
        System.out.println(l);


        float f;
        f = b;
        f = s;
        f = i;
        f = l;
        System.out.println(f);


        double d;
        d = b;
        d = s;
        d = i;
        d = l;
        d = f;
        System.out.println(d);

        System.out.println();
        int num1 = 30;
        int num2 = 20;

        num2 = num1;  // declaring num1 value is equal to num2 value
        System.out.println(num1); // 30
        System.out.println(num2); // 30

        num1 = num2;
        System.out.println(num1); // 30
        System.out.println(num2); // 30
    }
}

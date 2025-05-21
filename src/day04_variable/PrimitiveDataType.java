package day04_variable;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveDataType {
    public static void main(String[] args) {
        // Declaring variable --> Datatype VariableName;
        byte age;

        age = 10; //we have assigned initial value (first time giving value). We have initialized value.
        System.out.println(age); // single 'age' variable have value in it, my code can print it.
        System.out.println("age"); // here we're printing the DATA itself directly - DATA is letters (String)
        System.out.println(10); // here we're printing the DATA itself directly - DATA is whole number (int)
        System.out.println("10"); // here we're printing the DATA itself directly - DATA is letter. (String)

        age = 30; // I have REASSIGNED a value of 'age' variable.
        System.out.println(age);

        // Declaring variable + assigning initial value --> Datatype VariableName = value/data;
        short year = 2025;
        System.out.println(year); //short
        System.out.println(2025); // int

        // Declaring variable
        int AddressNo;
        // assigning value/data into variable called AddressNo
        AddressNo = 567987;
        System.out.println(AddressNo); // int
        System.out.println(45678); // int - the system declares whole numbers INT by default

        // Declaring variable
        long cardNo;
        // assigning value/data into variable called cardNo
        cardNo = 234567890878765L; // if number more than a billion put L at the end.
        System.out.println(cardNo);

    }
}

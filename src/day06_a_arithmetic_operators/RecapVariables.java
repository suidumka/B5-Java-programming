package day06_a_arithmetic_operators;

public class RecapVariables {
    public static void main(String[] args) {

        // implicit casting = widening conversion
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
        System.out.println();

    }
}

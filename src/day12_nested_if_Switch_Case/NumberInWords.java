package day12_nested_if_Switch_Case;

public class NumberInWords {
    public static void main(String[] args) {
        int num = 0;

        // Option1: MULTI BRUNCH IF statement / ELSE IF - control flow statement
        if (num== 0){
            System.out.println("zero");
        } else if (num == 1) {
            System.out.println("one");
        } else if (num ==2) {
            System.out.println("two");     // end etc 4 5 6 7  8 9 ...
        }else {
                System.out.println("All the other numbers which are not 0-9");
        }


        // Option2: SWITCH statement - Control flow statement
        // RULE 1 - the exactValues canNOT be DUPLICATE / cases cannot be duplicate
        // RULE 2 - For switch we canNOT compare with relational operators (>, <, <=, >=, [==], !=)
        // RULE 3 - String, char, int, short, byte

        switch (num) { //9
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
           default: // else part
        System.out.println("All the other numbers which are not 0-9");
    }
    }
}

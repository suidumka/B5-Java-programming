package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {
        /* && - output is true/false; data type - boolean;
        true + true = true
        true + false = false
        false + true = false
        false + false = false
        But if I put an exclamation mark ! before true/false it will convert
        the answer into opposite. So, !true becomes false and !false becomes true.
        ex: (6>1 && 1<10) - outcome is true

        Logical / Short circuit operators:
        && - AND logic
        || - OR logic


         */


                String name = "Tom Jerry";
                boolean isCitizen = true;
                boolean hasCriminalBackground = false; // NO
                int age = 30;

                //boolean is18orOlder = age >= 18;
                boolean isEligible = age >= 18 && isCitizen && !hasCriminalBackground; // true && true && !false

                System.out.println(name + " is eligible to vote: " + isEligible);


                System.out.println("--------------------------------------------------");
                name = "Winnie Pooh";
                isCitizen = false;
                hasCriminalBackground = false;
                age = 20;
                isEligible = age >= 18 && isCitizen && !hasCriminalBackground;
                //             true    &&  false    &&  !false(true)
                //                     false      &&  true
                //                              false

                System.out.println(name + " is eligible to vote: " + isEligible);


                System.out.println("--------------------------------------------------");
                name = "James Bond";
                isCitizen = true;
                hasCriminalBackground = false;
                age = 10;
                isEligible = age >= 18 && isCitizen && !hasCriminalBackground;
                //             false    &&  true    &&  !false(true)
                //                     false      &&  true
                //                              false

                System.out.println(name + " is eligible to vote: " + isEligible);






                System.out.println();
    }
}

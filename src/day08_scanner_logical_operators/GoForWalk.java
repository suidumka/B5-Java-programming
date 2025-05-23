package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {
        boolean isRaining = false;
        // boolean isNotRaining = false; // make the variables more clear, so i will not confuse in printout
        double temperature = 100;

        boolean canGoForWalk = !isRaining && temperature>70; // it means there is no rain with ! -> NOT operator
        System.out.println("There is no rain and the weather is nice: " + canGoForWalk);
    }
}

package SK;

public class Day_01 {
    public static void main(String[] args) {

        byte currentAge = 30;
        byte retirementAge = 65;
        int total_left = retirementAge - currentAge;
        String years_left = "Years left until retirement: " + total_left + " years left.";
        System.out.println(years_left);
    }
}

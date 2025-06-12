package H_day15;


public class TODO {
    public static void main(String[] args) {


        String word = "LOOP";

        if (word.length() >= 3){
            if (word.charAt(1) == word.charAt(2)){
                System.out.println("same");
            } else {
                System.out.println("different");
            }
        }
    }
}

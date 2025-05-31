package H_day09;

import java.util.Scanner;

public class GradeAfterRetake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score here:");
        double studentScore = input.nextDouble();

        System.out.println("Which attempt is this to retake the test?");
        int attempt = input.nextInt();

        if (attempt == 1) {
            studentScore = studentScore - (studentScore * 10 / 100);
            System.out.println("Good job! After the first attempt, your score is: " + studentScore);
        } else if (attempt == 2) {
            studentScore = studentScore - (studentScore * 20 / 100);
            System.out.println("After the second retake attempt, your score is: " + studentScore);
        } else if (attempt == 3) {
            studentScore = studentScore - (studentScore * 35 / 100);
            System.out.println("Next time make it better. After the third retake attempt, your score is:" + studentScore);
        }
        else {
            System.out.println("you failed"); // to handle the other case.
        }

    }
}
/*
Write a program that will give the grade after the retake.
    		The program should read a score of the test and which attempt it was.
        		If its the first attempt -> subtract 10%
        		If its the second attempt -> subtract 20%
        		If its the third attempt -> subtract 35%

		Note: Use Scanner class

		Example Output:
			Put your score:
			70
			Which attempt is this to retake the test?
			2
			After the second retake attempt, your score is: score
 */
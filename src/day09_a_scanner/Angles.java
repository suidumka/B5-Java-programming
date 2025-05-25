package day09_a_scanner;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
/*
    Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
    Determine if the angles make a triangle,
        which means the angles add to 180.0
    and Determine if the angles make a circle,
        which means the angles add to 360.0
 */

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter 3 angels:");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();
        double sumOfAngles = angle1 + angle2 + angle3;

        //If all angles ADDS up to 180, its triangle
        boolean isTriangle = sumOfAngles == 180;


        //If all angles ADDS up to 360, its circle
        boolean isCircle = sumOfAngles == 360;
        System.out.println();
        System.out.println(isTriangle);
        System.out.println(isCircle);
    }
}

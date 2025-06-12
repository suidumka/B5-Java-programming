package H_day12;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your school level: ");
        byte level = key.nextByte();
        switch (level){
            case 1,2,3,4,5:
                System.out.println("Elementary school");
                break;
            case 6,7,8:
                System.out.println("Middle school");
                break;
            case 9,10,11,12:
                System.out.println("High school");
                break;
            case 13,14,15,16:
                System.out.println("College");
                break;
            case 17,18:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid grade level given");
        }
    }
}
/*
Task:
    		    Given a grade level (byte) determine and print which school level someone is in.

        		1-5: Elementary school
        		6-8: Middle school
        		9-12: High school
        		13-16: College
        		17-18: Grad School
        		Other: Invalid grade level given

		Hint: You can use it else


        	Ex:
        		Enter a grade level to see which school level someone is in.
            		18

            		OUTPUT:
                		Grad School

 */

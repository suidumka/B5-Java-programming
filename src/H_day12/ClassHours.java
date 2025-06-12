package H_day12;

import java.util.Scanner;

public class ClassHours {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter day of the week, to check your schedule: ");
        String weekDay = key.nextLine();
        switch (weekDay){
            case "Monday","monday","1","Mon","mon":
                System.out.println("You have Mentor Hours.");
                break;
            case "Tuesday","tuesday","2", "Friday", "friday", "5":
                System.out.println("You have no classes.");
                break;
            case "Wednesday",  "wednesday",  "3", "Thursday", "thursday", "4", "Saturday", "saturday", "6":
                System.out.println("You have JAVA classes.");
                break;
            case "Sunday", "sunday", "7":
                System.out.println("You have SOFT SKILLS class.");
            default:
                System.out.println("Invalid input");
        }


    }
}
/*
the day12_tasks package

        Task:
    		Given some Day(String) print out the office hours schedule for that day if there is office hours.
        		Monday:
            			Print: Mentor Hours
        		Tuesday:
			Friday:
				Print: No Class
			Wednesday:
			Thursday:
			Saturday:
            			Print: Java Class
        		Sunday:
				Print: Soft skills
        		Any other String:
                        Print: Invalid day given


			Note: You need think of the cases the user put wrong input


        	Ex:
        		Enter the day of the week:
            		Wednesday

            		OUTPUT:
				Java Class

 */

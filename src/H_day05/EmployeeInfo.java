package H_day05;

public class EmployeeInfo {
    public static void main(String[] args) {
        String first_name = "James", last_name = "Bond";
        char gender = 'M';
        byte age = 40;
        String company_name = "MI6";
        boolean are_the_full_time = true;
        String job_title = "Special Agent";
        int salary = 1000000;
        byte number_of_pto = 15;
        boolean are_they_married = false;
        char suite = 'D';
        System.out.println("Employment information for " + first_name + " " + last_name + "\nGender: " + gender);
        System.out.println(job_title + " at " + company_name + "\nCurrently " + age + " years old");
        System.out.println(company_name + " is located in suite " + suite + "\nThis years salary comes to " + salary);
        System.out.println("Other details: \n\t\tPTO: " + age + "\n\t\tFull time? " + are_the_full_time + "\n\t\tMarried? "
                + are_they_married);

    }
}

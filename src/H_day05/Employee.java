package H_day05;

public class Employee {
    public static void main(String[] args) {
        String first_name = "Robert", last_name = " Deniro", company_name = "Delta_Airlines", job_title = "pilot";
        int salary = 180000, start_month = 05, start_day = 25, start_year = 2020;
        boolean are_they_full_time = true;
        String office_address = "1030 Delta Blvd, Atlanta, GA 30354, USA";
        String full_name = first_name + last_name;
        String full_start_date = start_month + "/" + start_day + "/" + start_year;
        String email = first_name + start_day + "@" + company_name + ".com";
        int SalaryIn3year = (salary + 26000 + 26000);


        System.out.println("Full Name:\t\t\t\t" + full_name + "\nStart Date:\t\t\t\t" + full_start_date + "\nE-mail:\t\t\t\t\t" +
                email + "\nSalary after 3 years: \t$" + SalaryIn3year);
    }
}

package Homework_day05;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Chevy Cruze", driverName = "Suidum",licenseNum = "KGZ2578";
        short speed = 280;
        boolean isAutomatic = true;
        char licenseClass = 'B';

        System.out.println("Car model is: " + carModel + "\nDriver name is: " + driverName + "\nCar license No: " + licenseNum);
        System.out.println("\tMax speed of car: " + speed + "\n\tCar is automatic: " + isAutomatic +
                "\n\tClass of license: "+ licenseClass);


    }
}

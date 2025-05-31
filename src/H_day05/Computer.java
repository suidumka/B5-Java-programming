package H_day05;

public class Computer {
    public static void main(String[] args) {
        String brand = "Apple", processor = "Apple M1", color = "grey";
        byte ram_memory = 16;
        short storage_memory = 512;
        boolean has_monitor = true, has_wifi_card = false, has_usb = false;
        String description = "MacBook Air with M1 chip";
        short price = 1499;
        byte numOfMonitors = 1;
        byte numOfUsbSlots = 0;


        System.out.println("\n\nAbout this laptop " + description + " for affordable price starting with " + price + "$ and the color is " + color);
        System.out.println("Brand:\t\t\t " + brand + "\nProcessor:\t\t " + processor + "\nRam memory: \t " + ram_memory + "\nStorage memory:\t "
                + storage_memory);
        System.out.println("Has monitor: \t " + has_monitor + "\nHas WiFi card:\t " + has_wifi_card);
        System.out.println("Monitors:\t\t " + numOfMonitors + "\nSlot numbers:\t " + numOfUsbSlots + "\nHas USB slots:\t " + has_usb);

    }
}

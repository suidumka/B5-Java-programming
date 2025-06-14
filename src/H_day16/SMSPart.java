package H_day16;

public class SMSPart {
    public static void main(String[] args) {
        String text = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving\"}";

        String sender = text.substring(text.indexOf("<") +1, text.indexOf(">"));
        String number = text.substring(text.indexOf("[") +1, text.indexOf("]"));
        String message = text.substring(text.indexOf("{") +1, text.indexOf("}"));

        System.out.println("Please find the information below: \n");
        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);

    }
}
/*

                Given a String in the following format:
                    “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”

                    Separate these parts and print them separately:
                        Sender: actualSender
                        Number: actualNumber
                        Message: actualMessage


 */
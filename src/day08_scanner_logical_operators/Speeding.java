package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {

                int currentSpeed = 10;
                int schoolSpeedLimit = 25;
                int allowedOverSpeed = 5;
                // if you are going over 5 miles from school zone speed limit, that is fine.
                schoolSpeedLimit += 5;
                boolean isSpeeding = currentSpeed > schoolSpeedLimit;

                System.out.println("The speeding limit in School zone is " + schoolSpeedLimit + " mph.");
                System.out.println("You are speeding: " + isSpeeding);
    }
}

import java.util.Scanner;

public class Main5 {
    private static final int MAX_PASSENGER_STRENGTH = 100;
    private static int TRAIN_1_PASSENGER_STRENGTH = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        while (exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Display available seats");
            System.out.println("2. Book a ticket");
            System.out.println("3. Cancel a ticket");
            System.out.println("4. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Seats available: " + TRAIN_1_PASSENGER_STRENGTH);
                    break;
                case 2:
                    if (TRAIN_1_PASSENGER_STRENGTH > 0) {
                        System.out.println("Enter passenger name:");
                        String passengerName = scanner.next();
                        System.out.println("Enter seat number:");
                        int seatNumber = scanner.nextInt();
                        TRAIN_1_PASSENGER_STRENGTH--;
                        System.out.println("Ticket booked for " + passengerName + ", Seat Number: " + seatNumber);
                    } else {
                        System.out.println("No seats available.");
                    }
                    break;
                case 3:
                    if (TRAIN_1_PASSENGER_STRENGTH < MAX_PASSENGER_STRENGTH) {
                        TRAIN_1_PASSENGER_STRENGTH++;
                        System.out.println("Ticket canceled for passenger.");
                    } else {
                        System.out.println("No tickets to cancel.");
                    }
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}


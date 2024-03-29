import java.util.Scanner;
class RailwayReservation {
    private int registeredNo;
    private int setNewNo;

    public int getRegisteredNo() {
        return registeredNo;
    }

    public void setRegisteredNo(int registeredNo) {
        this.registeredNo = registeredNo;
    }

    public int getSetNewNo() {
        return setNewNo;
    }

    public void setSetNewNo(int setNewNo) {
        this.setNewNo = setNewNo;
    }
}

public class RailwaysDept {
    public static void main(String[] args) {
        String[] totalSeats = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "C1", "C2", "C3", "C4", "D1", "D2", "D3", "D4"};
        String[] filledSeats = {"A1", "A2", "B3", "B4", "C1", "C2"};
        String[] emptySeats = {"A3", "A4", "B1", "B2", "C3", "C4", "D1", "D2", "D3", "D4"};

        RailwayReservation r = new RailwayReservation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the case: 1.Registered user 2.New user 3.Displaying seats");
        int cas = scanner.nextInt();

        switch (cas) {
            case 1:
                System.out.println("Registered user");
                int s = scanner.nextInt();
                r.setRegisteredNo(s);
                System.out.println("\nBalance empty seats ");
                for (String seat : emptySeats) {
                    System.out.print(seat + " ");
                }
                if (s != 0) {
                    System.out.println("\n Enter the passenger name:");
                    String passengerName = scanner.next();
                    System.out.println("Enter seat number:");
                    String seatNumber = scanner.next();
                    boolean seatAvailable = false;
                    for (String seat : emptySeats) {
                        if (seatNumber.equals(seat)) {
                            seatAvailable = true;
                            break;
                        }
                    }
                    if (seatAvailable) {
                        System.out.println("Ticket booked for " + passengerName + ", Seat Number: " + seatNumber);
                        break;
                    } else {
                        System.out.println("Seat " + seatNumber + " is not available.");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("New user");
                int s1 = scanner.nextInt();
                r.setSetNewNo(s1);
                System.out.println("\nBalance empty seats ");
                for (String seat : emptySeats) {
                    System.out.print(seat + " ");
                }
                if (s1 != 0) {
                    System.out.println("Enter the passenger name:");
                    String passengerName = scanner.next();
                    System.out.println("Enter seat number:");
                    String seatNumber = scanner.next();
                    System.out.println("Ticket booked for " + passengerName + ", Seat Number: " + seatNumber);
                    boolean seatAvailable = false;
                    for (String seat : emptySeats) {
                        if (seatNumber.equals(seat)) {
                            seatAvailable = true;
                        }
                    }
                    if (seatAvailable) {
                        System.out.println("Ticket booked for " + passengerName + ", Seat Number: " + seatNumber);
                        break;
                    } else {
                        System.out.println("Seat " + seatNumber + " is not available.");
                        break;
                    }
                }
            case 3:
                System.out.println("Displaying total seats");
                for (String seat : totalSeats) {
                    System.out.print(seat + " ");
                }
                System.out.println("\nDisplaying filled seats");
                for (String seat : filledSeats) {
                    System.out.print(seat + " ");
                }
                System.out.println("\nBalance empty seats ");
                for (String seat : emptySeats) {
                    System.out.print(seat + " ");
                }
                break;
        }
        scanner.close();
    }
}

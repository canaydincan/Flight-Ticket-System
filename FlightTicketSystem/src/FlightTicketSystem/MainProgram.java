package FlightTicketSystem;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin manager = new Admin();

        // Manager login section

        System.out.println("****************************************************");
        System.out.println("************          ******************************");
        System.out.println("*********     ********  ****************************");
        System.out.println("*******     ************  ************ *************");
        System.out.println("*******    **************************   ************");
        System.out.println("******     ***********************    *    *********");
        System.out.println("*******    *************************  *  ***********");
        System.out.println("*******     ************  ********** *** ***********");
        System.out.println("********     *********  ****************************");
        System.out.println("************           *****************************");
        System.out.println("****************************************************");

        System.out.println("Welcome to the Airline Ticket System.");
        System.out.println("You are at Istanbul Airport.");
        System.out.println("If you are not a manager, you can press any key for the password.");       
        System.out.print("Enter manager password: ");
        String adminName = scanner.next();


        if (adminName.equalsIgnoreCase("Admin")) {
            // Manager operation section
            System.out.println("Welcome to the Airline Ticket System " + adminName + ".");
                
            while (true) {
                System.out.println("\n1. Show Flights\n2. Add New Flight\n3. Delete Flight\n4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                case 1:
                    manager.showFlights();
                    break;
                case 2:
                    System.out.print("Enter flight number: ");
                    String newFlightNumber = scanner.next();
                    System.out.print("Enter destination: ");
                    String newDestination = scanner.next();
                    System.out.print("Enter available seat count: ");
                    int newAvailableSeats = scanner.nextInt();

                    Flight newFlight = new Flight(newFlightNumber, newDestination, newAvailableSeats);
                    manager.addFlight(newFlight);
                    break;
                case 3:
                    System.out.print("Enter flight number to delete: ");
                    String flightNumberToDelete = scanner.next();
                    manager.removeFlight(flightNumberToDelete);
                    break;
                case 4:
                    System.out.println("Exiting the system... Have a nice day!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            // User login section
            System.out.print("Enter your first name: ");
            String userFirstName = scanner.next();
            System.out.print("Enter your last name: ");
            String userLastName = scanner.next();  

            User user = new User(userFirstName, userLastName);
            
            System.out.println("Welcome to the Airline Ticket System " + userFirstName + " " + userLastName + ".");
            
            while (true) {
                System.out.println(
                    "\n1. Show Flights\n2. Make New Reservation\n3. Show Reserved Flights\n4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                case 1:
                    manager.showFlights();
                    break;
                case 2:
                    System.out.print("Enter flight number to reserve: ");
                    String reservationFlightNumber = scanner.next();
                    Flight reservationFlight = manager.getFlight(reservationFlightNumber);
                    if (reservationFlight != null) {
                        System.out.print("Enter seat count to reserve: ");
                        int reservationSeatCount = scanner.nextInt();
                        user.makeReservation(reservationFlight, reservationSeatCount);
                    } else {
                        System.out.println("The specified flight number was not found.");
                    }
                    break;
                case 3:
                    user.showReservations();
                    break;
                case 4:
                    System.out.println("Exiting... Have a nice day!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                }
            }          
        }
    }
}
package FlightTicketSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private List<Flight> reservations;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.reservations = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void makeReservation(Flight flight, int seatCount) {
        if (seatCount > 0 && seatCount <= flight.getAvailableSeats()) {
            flight.makeReservation(seatCount);
            reservations.add(flight);
        } else {
            System.out.println("Not enough available seats for the specified flight.");
        }
    }

    public void showReservations() {
        System.out.println("Your Reservations:");
        for (Flight flight : reservations) {
            System.out.println(flight.getFlightNumber() + " - " + flight.getDestination());
        }
    }
}
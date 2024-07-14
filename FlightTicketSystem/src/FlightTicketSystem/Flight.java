package FlightTicketSystem;

public class Flight {
    private String flightNumber;
    private String destination;
    private int availableSeats;

    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void makeReservation(int seatCount) {
        if (seatCount > 0 && seatCount <= availableSeats) {
            availableSeats -= seatCount;
            System.out.println("Successfully reserved " + seatCount + " seats for flight number " 
                               + flightNumber + ".");
        } else {
            System.out.println("Not enough available seats for flight " + flightNumber + ".");
        }
    }
}
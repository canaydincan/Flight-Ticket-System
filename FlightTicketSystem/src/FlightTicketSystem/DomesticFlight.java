package FlightTicketSystem;

public class DomesticFlight extends Flight {
    private String domesticFlightNumber;

    public DomesticFlight(String flightNumber, String destination, int availableSeats, String domesticFlightNumber) {
        super(flightNumber, destination, availableSeats);
        this.domesticFlightNumber = domesticFlightNumber;
    }

    public String getDomesticFlightNumber() {
        return domesticFlightNumber;
    }
}
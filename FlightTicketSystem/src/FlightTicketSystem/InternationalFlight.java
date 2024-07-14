package FlightTicketSystem;

public class InternationalFlight extends Flight {
    private String country;

    public InternationalFlight(String flightNumber, String destination, int availableSeats, String country) {
        super(flightNumber, destination, availableSeats);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
package FlightTicketSystem;

import java.util.HashMap;
import java.util.Map;

public class Admin {
    private Map<String, Flight> flights;

    public Admin() {
        this.flights = new HashMap<>();
        initializeFlights();
    }

    private void initializeFlights() {
        flights.put("U101", new InternationalFlight("U101", "New York", 100, "US101"));
        flights.put("U102", new InternationalFlight("U102", "Los Angeles", 120, "US102"));
        flights.put("U103", new InternationalFlight("U103", "Chicago", 80, "US103"));
        flights.put("U104", new InternationalFlight("U104", "Paris", 110, "FR101"));
        flights.put("U105", new InternationalFlight("U105", "Tokyo", 150, "JP101"));
        flights.put("U106", new InternationalFlight("U106", "Berlin", 130, "GR101"));
        flights.put("U107", new InternationalFlight("U107", "Rome", 120, "IT101"));
        flights.put("U108", new InternationalFlight("U108", "London", 140, "EN101"));
        flights.put("U109", new DomesticFlight("U109", "Ankara", 90, "TR101"));
        flights.put("U110", new DomesticFlight("U110", "Izmir", 70, "TR102"));
        flights.put("U111", new DomesticFlight("U111", "Denizli", 80, "TR103"));
        flights.put("U112", new DomesticFlight("U112", "Sivas", 80, "TR104"));
    }

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
        System.out.println("New flight added: " + flight.getFlightNumber());
    }

    public void removeFlight(String flightNumber) {
        if (flights.containsKey(flightNumber)) {
            flights.remove(flightNumber);
            System.out.println("Flight removed: " + flightNumber);
        } else {
            System.out.println("The selected flight number was not found.");
        }
    }

    public void showFlights() {
        System.out.println("Current Flights:");

        flights.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
            Flight flight = entry.getValue();
            System.out.println(flight.getFlightNumber() + " - " + flight.getDestination() + " (Available Seats: "
                    + flight.getAvailableSeats() + ")");
        });
    }

    public Flight getFlight(String flightNumber) {
        return flights.get(flightNumber);
    }
}
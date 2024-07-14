# Airline Ticket System

This project is an airline ticket system developed in Java. The system includes reservation and management functionalities for both domestic and international flights. Users can log in with two different roles: user and administrator.

## Features

### User Login
- **View Flights**: You can view available flights.
- **Make Reservations**: You can make reservations for selected flights.
- **View Reservations**: You can view your previous reservations.
- **Logout**: You can securely log out from the system.

### Administrator Login
- **View Flights**: You can view available flights.
- **Add Flights**: You can add new flights to the system.
- **Delete Flights**: You can delete existing flights from the system.
- **Logout**: You can securely log out from the system.

#### Project Structure
airline-ticket-system/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/example/
│   │   │   │   ├── MainProgram.java
│   │   │   │   ├── User.java
│   │   │   │   ├── Admin.java
│   │   │   │   ├── InternationalFlight.java
│   │   │   │   ├── Flight.java
│   │   │   │   └── DomesticFlight.java
│   │   └── resources/
│   └── test/
│       └── java/
│           └── com/example/
│               └── ...
│
├── pom.xml
└── README.md

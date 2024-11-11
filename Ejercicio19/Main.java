package Ejercicio19;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("FL123", 5);

        Passenger passenger1 = new Passenger("John Doe", "A123456");
        Passenger passenger2 = new Passenger("Jane Smith", "B654321");

        Reservation reservation1 = flight.bookSeat(passenger1, new Date(), 1);
        Reservation reservation2 = flight.bookSeat(passenger2, new Date(), 2);

        System.out.println("Current Reservations:");
        for (Reservation reservation : flight.getReservations()) {
            System.out.println(reservation);
        }

        if (reservation1 != null) {
            flight.cancelReservation(reservation1);
        }
        System.out.println("\nReservations after cancellation:");
        for (Reservation reservation : flight.getReservations()) {
            System.out.println(reservation);
        }
    }
}

package Ejercicio19;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
    private String flightNumber;
    private int totalSeats;
    private List<Reservation> reservations;

    public Flight(String flightNumber, int totalSeats) {
        this.flightNumber = flightNumber;
        this.totalSeats = totalSeats;
        this.reservations = new ArrayList<>();
    }

    public boolean isSeatAvailable() {
        return reservations.size() < totalSeats;
    }

    public Reservation bookSeat(Passenger passenger, Date date, int seatNumber) {
        if (isSeatAvailable()) {
            Reservation reservation = new Reservation(this, passenger, date, seatNumber);
            reservations.add(reservation);
            System.out.println("Reservation confirmed for seat " + seatNumber);
            return reservation;
        } else {
            System.out.println("No seats available.");
            return null;
        }
    }

    public boolean cancelReservation(Reservation reservation) {
        if (reservations.remove(reservation)) {
            System.out.println("Reservation cancelled for seat " + reservation.getSeatNumber());
            return true;
        } else {
            System.out.println("Reservation not found.");
            return false;
        }
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}

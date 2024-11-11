package Ejercicio19;

import java.util.Date;

public class Reservation {
    private Flight flight;
    private Passenger passenger;
    private Date reservationDate;
    private int seatNumber;

    public Reservation(Flight flight, Passenger passenger, Date reservationDate, int seatNumber) {
        this.flight = flight;
        this.passenger = passenger;
        this.reservationDate = reservationDate;
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Reservation for passenger " + passenger.getName() + " on flight " +
                flight.getFlightNumber() + " seat " + seatNumber + " on date " + reservationDate;
    }
}

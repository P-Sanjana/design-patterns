package strategy;

import java.util.Date;

public class HotelBooking implements BookingStrategy{
    public boolean makeBooking(Date fromDate, Date toDate, int noOfPassengers) {
        System.out.println("Booking hotel...");
        // booking logic
        return toDate.after(fromDate);
    }
}

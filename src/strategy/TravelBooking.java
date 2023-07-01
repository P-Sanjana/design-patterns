package strategy;

import java.util.Date;

public class TravelBooking implements BookingStrategy{
    public boolean makeBooking(Date fromDate, Date toDate, int noOfPassengers) {
        System.out.println("Booking travel...");
        // booking logic
        return toDate.after(fromDate);
    }
}

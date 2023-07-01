package strategy;

import java.util.Date;

public interface BookingStrategy {
   boolean makeBooking(Date fromDate, Date toDate, int noOfPassengers);
}

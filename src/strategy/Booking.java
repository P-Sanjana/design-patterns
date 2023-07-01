package strategy;

import java.util.Date;

public class Booking {
    private Date fromDate;
    private Date toDate;
    private int noOfPassengers;

    // stores reference of strategy object
    private BookingStrategy bookingStrategy;

    public Booking(Date fromDate, Date toDate, int passengers) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.noOfPassengers = passengers;
    }

    // used to change booking strategy at run time
    public void setBookingStrategy(BookingStrategy strategy){
        this.bookingStrategy = strategy;
    }

    //delegates booking functionality to strategy object
    public void makeBooking(){
        boolean isBooked = bookingStrategy.makeBooking(this.fromDate, this.toDate, this.noOfPassengers);
        if(isBooked){
            System.out.println("Booked successfully!");
        }
        else {
            System.out.println("Booking Failed");
        }
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int passengers) {
        this.noOfPassengers = passengers;
    }

    public BookingStrategy getBookingStrategy() {
        return bookingStrategy;
    }
}

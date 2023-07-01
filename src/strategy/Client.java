package strategy;

import java.text.ParseException;
import java.util.Scanner;

import utils.DateFormatConversions;

public class Client {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter from-date in dd-mm-yyy format");
        String fromDate = sc.next();
        System.out.println("Please enter to-date in dd-mm-yyyy format");
        String toDate = sc.next();
        System.out.println("Please enter the no. of passengers");
        int passengers = sc.nextInt();
        System.out.println("Select type of booking: 1.Travel 2.Hotel");
        int choice = sc.nextInt();
        DateFormatConversions dateFormatConversions = new DateFormatConversions();
        Booking booking = new Booking(dateFormatConversions.convertStringToDate(fromDate), dateFormatConversions.convertStringToDate(toDate), passengers);
        // dynamically change type of strategy
        if(choice==1){
            booking.setBookingStrategy(new TravelBooking());
        }
        else if(choice==2){
            booking.setBookingStrategy(new HotelBooking());
        }
        else {
            System.out.println("Please enter correct choice");
            System.exit(0);
        }
        booking.makeBooking();
    }
}

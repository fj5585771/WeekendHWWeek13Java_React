package codeclan.booking_system.models;

import codeclan.booking_system.repositories.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.crypto.BadPaddingException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookingTest {

    @Autowired
    BookingRepository bookingRepository;

//    @Test
//    public void canGetBooking(){
//        Booking booking = new Booking(Course, Customer, "02/02/21");
//    }

}
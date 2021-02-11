package codeclan.booking_system.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

    Course course;
    Booking booking1;
    Booking booking2;
    Booking booking3;

    @Before
    public void setUp() throws Exception {
        booking1 = new Booking();
        booking2 = new Booking();
        booking3 = new Booking();
        course = new Course("Java", "Edinburgh", 5);
    }

    @Test
    public void getName() {
        assertEquals("Java", course.getName());
    }

    @Test
    public void addBooking() {
        course.addBooking(booking1);
        assertEquals(1, course.getBookings().size());
    }

    @Test
    public void setName() {
    }

    @Test
    public void getTown() {
    }

    @Test
    public void setTown() {
    }

    @Test
    public void getRating() {
    }

    @Test
    public void setRating() {
    }
}
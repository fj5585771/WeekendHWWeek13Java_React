package codeclan.booking_system.repositories;

import codeclan.booking_system.models.Booking;
import codeclan.booking_system.models.Course;
import codeclan.booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getBookingsByDate(String date);
    List<Booking> getBookingByCourseName(Course course);
    List<Booking> getBookingByCustomer(Customer customer);

}

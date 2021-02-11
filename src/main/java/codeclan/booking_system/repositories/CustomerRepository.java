package codeclan.booking_system.repositories;

import codeclan.booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

//    List<Customer> findByCourseNameIgnoreCase(String courseName);

}

package codeclan.booking_system.models;

import codeclan.booking_system.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CustomerTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void contextLoads(){

    }

//    @Test
//    List<Customer> foundCourses = customerRepository.findByCourseName("");
//    assertEquals("", foundCourses.get(0).getName());

}
package codeclan.booking_system.components;

import codeclan.booking_system.models.Customer;
import codeclan.booking_system.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }
    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Barry", 35);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Wendy", 25);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Freddy", 18);
        customerRepository.save(customer3);




    }
}



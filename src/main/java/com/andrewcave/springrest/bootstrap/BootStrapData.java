package com.andrewcave.springrest.bootstrap;

import com.andrewcave.springrest.domain.Customer;
import com.andrewcave.springrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;


    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading customer data");

        Customer c1 = new Customer();
                c1.setFirstname("Obi Wan");
                c1.setLastname("Kenobi");
                customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Anakin");
        c2.setLastname("Skywalker");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Luke");
        c3.setLastname("Skywalker");
        customerRepository.save(c3);

        System.out.println("Customers saved. " + customerRepository.count());
    }
}

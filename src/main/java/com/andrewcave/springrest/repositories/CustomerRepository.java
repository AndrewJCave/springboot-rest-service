package com.andrewcave.springrest.repositories;

import com.andrewcave.springrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
}

package net.ayman.customerservice.repository;

import net.ayman.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer,Long> {

}

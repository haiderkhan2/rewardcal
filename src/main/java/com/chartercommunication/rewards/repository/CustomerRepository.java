package com.chartercommunication.rewards.repository;

import com.chartercommunication.rewards.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}

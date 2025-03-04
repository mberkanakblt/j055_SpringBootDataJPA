package com.mehmetberkan.jpa.repository;

import com.mehmetberkan.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllByName(String name);
}

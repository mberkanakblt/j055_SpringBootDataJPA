package com.mehmetberkan.jpa.service;

import com.mehmetberkan.jpa.entity.Customer;
import com.mehmetberkan.jpa.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // Gerekli(zorunlu) olan contructorı ekler.
public class CustomerService {
    private final CustomerRepository repository;

    public void save(Customer customer) {
        repository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return repository.findAll();
    }

    public List<Customer> getCustomerByName(String name) {
        return repository.findAllByName(name);
    }

}

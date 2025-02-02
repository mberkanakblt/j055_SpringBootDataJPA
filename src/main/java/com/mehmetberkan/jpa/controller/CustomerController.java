package com.mehmetberkan.jpa.controller;

import com.mehmetberkan.jpa.entity.Customer;
import com.mehmetberkan.jpa.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/add-customer")
    public ResponseEntity<Void> addCustomer(String name, String phone,String email){
        Customer customer = Customer.builder().name(name)
                .phone(phone).email(email).build();
        customerService.save(customer);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/get-all")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> customerList = customerService.getAllCustomer();
        return ResponseEntity.ok().body(customerList);
    }
    @GetMapping("/get-by-name")
    public ResponseEntity<List<Customer>> getCustomerByName(String name){
    return ResponseEntity.ok().body(customerService.getCustomerByName(name));
    }
}

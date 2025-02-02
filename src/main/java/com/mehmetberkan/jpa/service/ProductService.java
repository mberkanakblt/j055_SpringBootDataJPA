package com.mehmetberkan.jpa.service;

import com.mehmetberkan.jpa.entity.Product;
import com.mehmetberkan.jpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    public List<Product> getAll() {
        return repository.findAll();
    }

    public void addProduct(String name, String model, Double price) {
        repository.save(Product.builder()
                .model(model)
                .name(name)
                .price(price)
                .build());
    }

    public List<Product> getAllByModel(String model) {
        return repository.findAllByModel(model);
    }
}


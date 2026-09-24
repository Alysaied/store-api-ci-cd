package com.example.store_api;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<Product> findAll() {
        return List.of(
                new Product(1L, "Laptop", 25000),
                new Product(2L, "Mouse", 500)
        );
    }
}

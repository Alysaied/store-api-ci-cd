package com.example.store_api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {
    @Test
    void shouldReturnTwoProducts(){
        ProductService service = new ProductService();

        var products = service.findAll();
        assertEquals(3, products.size());
    }
}


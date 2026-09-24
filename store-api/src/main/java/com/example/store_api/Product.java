package com.example.store_api;

public record Product(
        Long id,
        String name,
        double price
) {
}

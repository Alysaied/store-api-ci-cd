package com.example.store_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/environment")
public class EnvironmentController {
    @Value("${app.environment}")
    private String environment;

    @GetMapping
    public String getEnvironment() {
        return environment;
    }
}

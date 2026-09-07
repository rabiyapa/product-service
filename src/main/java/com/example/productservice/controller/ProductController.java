package com.example.productservice.controller;

import com.example.productservice.entity.Product;
import org.springframework.web.bind.annotation.*;
import com.example.productservice.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return service.getAllProducts();
    }
}
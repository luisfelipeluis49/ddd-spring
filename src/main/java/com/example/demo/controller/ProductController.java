package com.example.demo.controller;

import com.example.demo.dto.Department;
import com.example.demo.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public List<Product> getObjects() {
        Department techDepartment = new Department(1, "Tech");
        Department foodDepartment = new Department(2, "Food");
        Product macbookPro = new Product(1, "Macbook Pro", 4100, techDepartment);
        Product dellInspiron = new Product(2, "Dell Inspiron", 2100, techDepartment);
        Product mamaoKg = new Product(3, "Mamão Kg", 10, foodDepartment);
        Product vigorGrego = new Product(4, "Vigor Grego", 4, foodDepartment);

        List<Product> products = Arrays.asList(macbookPro, dellInspiron, mamaoKg, vigorGrego);

        return products;
    }


}

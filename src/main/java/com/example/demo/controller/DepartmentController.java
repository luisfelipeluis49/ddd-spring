package com.example.demo.controller;

import com.example.demo.dto.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
    @GetMapping
    public Department getDepartments() {
        Department department = new Department();
        department.setId(1);
        department.setName("Tech");
        return department;
    }


}

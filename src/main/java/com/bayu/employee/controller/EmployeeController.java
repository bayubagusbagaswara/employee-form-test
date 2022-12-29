package com.bayu.employee.controller;

import com.bayu.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    // handle to create new employee

    @GetMapping()
    public String showFormAddEmployee() {
        return "";
    }

    // handle to edit employee

    // handle to get employee by id

    // handle to get all employees

    // handle to delete employee by id
}

package com.bayu.employee.controller;

import com.bayu.employee.model.Employee;
import com.bayu.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    // menampilkan form untuk Add Employee
    @GetMapping("/show-form-employee")
    public String showFormAddEmployee() {
        return "";
    }

    // melakukan aksi penyimpanan Employee baru
    @PostMapping("/save-employee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        return "";
    }

    // menampilkan form untuk Add Employee Educational Background

    // melakukan aksi penyimpanan Employee Educational Background

    // menampilkan form untuk Add Employee Training History

    // melakukan aksi penyimpanan Employee Training History

    // menampilkan form untuk Add Employee Work Experience

    // melalukan aksi penyimpanan Employee Work Experience


    // handle to edit employee
    @PutMapping("/edit-employee")
    public String editEmployee(String id, @ModelAttribute("employee") Employee employee) {
        return "";
    }

    // handle to get employee by id

    // handle to get all employees

    // handle to delete employee by id
}

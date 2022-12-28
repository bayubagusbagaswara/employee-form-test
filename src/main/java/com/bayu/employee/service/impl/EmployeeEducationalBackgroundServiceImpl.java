package com.bayu.employee.service.impl;

import com.bayu.employee.repository.EmployeeEducationalBackgroundRepository;
import com.bayu.employee.service.EmployeeEducationalBackgroundService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeEducationalBackgroundServiceImpl implements EmployeeEducationalBackgroundService {

    private final EmployeeEducationalBackgroundRepository educationalBackgroundRepository;

    public EmployeeEducationalBackgroundServiceImpl(EmployeeEducationalBackgroundRepository educationalBackgroundRepository) {
        this.educationalBackgroundRepository = educationalBackgroundRepository;
    }
}

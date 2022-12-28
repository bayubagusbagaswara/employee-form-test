package com.bayu.employee.service.impl;

import com.bayu.employee.repository.EmployeeWorkExperienceRepository;
import com.bayu.employee.service.EmployeeWorkExperienceService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeWorkExperienceServiceImpl implements EmployeeWorkExperienceService {

    private final EmployeeWorkExperienceRepository workExperienceRepository;

    public EmployeeWorkExperienceServiceImpl(EmployeeWorkExperienceRepository workExperienceRepository) {
        this.workExperienceRepository = workExperienceRepository;
    }
}

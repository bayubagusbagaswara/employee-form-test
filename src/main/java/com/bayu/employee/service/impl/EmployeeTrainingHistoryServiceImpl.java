package com.bayu.employee.service.impl;

import com.bayu.employee.repository.EmployeeTrainingHistoryRepository;
import com.bayu.employee.service.EmployeeTrainingHistoryService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTrainingHistoryServiceImpl implements EmployeeTrainingHistoryService {

    private final EmployeeTrainingHistoryRepository trainingHistoryRepository;

    public EmployeeTrainingHistoryServiceImpl(EmployeeTrainingHistoryRepository trainingHistoryRepository) {
        this.trainingHistoryRepository = trainingHistoryRepository;
    }
}

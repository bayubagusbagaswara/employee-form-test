package com.bayu.employee.repository;

import com.bayu.employee.model.EmployeeTrainingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTrainingHistoryRepository extends JpaRepository<EmployeeTrainingHistory, String> {
}

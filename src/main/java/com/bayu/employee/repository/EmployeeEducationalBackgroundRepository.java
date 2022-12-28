package com.bayu.employee.repository;

import com.bayu.employee.model.EmployeeEducationalBackground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeEducationalBackgroundRepository extends JpaRepository<EmployeeEducationalBackground, String> {
}

package com.bayu.employee.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employee_work_experience")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeWorkExperience {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "last_position")
    private String lastPosition;

    @Column(name = "last_income")
    private String lastIncome;

    @Column(name = "year")
    private String year;

    @ManyToOne
    @JoinColumn(name = "id_employee", foreignKey = @ForeignKey(name = "fk_work_experience_id_employee"), referencedColumnName = "id")
    private Employee employee;

}

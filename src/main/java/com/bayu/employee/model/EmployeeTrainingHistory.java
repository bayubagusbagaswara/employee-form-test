package com.bayu.employee.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employee_training_history")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTrainingHistory {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "certificate")
    private String certificate;

    @Column(name = "year")
    private String year;

    @ManyToOne
    @JoinColumn(name = "id_employee", foreignKey = @ForeignKey(name = "fk_training_history_id_employee"), referencedColumnName = "id")
    private Employee employee;

}

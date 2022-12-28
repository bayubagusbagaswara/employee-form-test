package com.bayu.employee.model;

import com.bayu.employee.model.audit.UserDateAudit;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employees")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends UserDateAudit {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<EmployeeEducationalBackground> educationalBackgrounds;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<EmployeeTrainingHistory> trainingHistories;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<EmployeeWorkExperience> workExperiences;
}

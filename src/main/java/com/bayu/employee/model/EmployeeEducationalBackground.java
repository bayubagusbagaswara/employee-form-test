package com.bayu.employee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employee_educational_background")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEducationalBackground {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @Column(name = "last_level_of_education")
    private String lastLevelOfEducation;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "major")
    private String major;

    @Column(name = "graduation_year")
    private String graduationYear;

    @Column(name = "ipk")
    private String ipk;

    @ManyToOne
    @JoinColumn(name = "id_employee", foreignKey = @ForeignKey(name = "fk_educational_background_id_employee"), referencedColumnName = "id")
    private Employee employee;

}



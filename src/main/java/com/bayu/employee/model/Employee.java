package com.bayu.employee.model;

import com.bayu.employee.model.enumerator.Gender;
import com.bayu.employee.model.enumerator.ReadyToBePlaceInAll;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "employees")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @Column(name = "applied_position")
    private String appliedPosition;

    @Column(name = "name")
    private String name;

    @Column(name = "number_ktp")
    private String numberKtp;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "married_status")
    private String marriedStatus;

    @Column(name = "address_ktp")
    private String addressKtp;

    @Column(name = "address_home")
    private String addressHome;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "closest_contact")
    private String closestContact;

    @Column(name = "skill")
    private String skill;

    @Enumerated(EnumType.STRING)
    @Column(name = "readyToBePlaceInAll")
    private ReadyToBePlaceInAll readyToBePlaceInAll;

    @Column(name = "expected_salary")
    private BigDecimal expectedSalary;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<EmployeeEducationalBackground> educationalBackgrounds;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<EmployeeTrainingHistory> trainingHistories;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<EmployeeWorkExperience> workExperiences;

}

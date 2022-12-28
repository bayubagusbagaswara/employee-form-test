package com.bayu.employee.model;

import com.bayu.employee.model.audit.UserDateAudit;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employee_work_experience")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeWorkExperience extends UserDateAudit {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_employee", foreignKey = @ForeignKey(name = "fk_work_experience_id_employee"), referencedColumnName = "id")
    private Employee employee;

    // namaPerusahaan
    // posisiTerakhir
    // pendapatanTerakhir
    // tahun
}

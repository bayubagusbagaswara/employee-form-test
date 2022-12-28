package com.bayu.employee.model;

import com.bayu.employee.model.audit.UserDateAudit;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employee_training_history")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTrainingHistory extends UserDateAudit {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_employee", foreignKey = @ForeignKey(name = "fk_training_history_id_employee"), referencedColumnName = "id")
    private Employee employee;

}

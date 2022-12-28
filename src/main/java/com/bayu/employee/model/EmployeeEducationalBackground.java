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

    @ManyToOne
    @JoinColumn(name = "id_employee", foreignKey = @ForeignKey(name = "fk_educational_background_id_employee"), referencedColumnName = "id")
    private Employee employee;

    // jenjangPendidikanTerakhir
    // namaInstitusiAkademik
    // jurusan
    // tahunLulus
    // IPK
}



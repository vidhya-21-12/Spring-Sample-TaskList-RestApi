package com.example.SpringTask.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "EmployeeDetails")
public class Employee {

    @Id
    @GeneratedValue(generator = "id",strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "empName")
    private String empName;

    @Column(name = "empDateOfBirth")
    private String empDateOfBirth;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "DateOfJoining")
    private String DateOfJoining;

    @Column(name = "jobTitle")
    private String jobTitle;

    @Column(name = "Description")
    private String Description;

    @OneToOne(mappedBy = "userPatient", cascade = CascadeType.ALL)
    @Cascade({ org.hibernate.annotations.CascadeType.SAVE_UPDATE })
    @JsonManagedReference
    private PersonalDetails patients;

}

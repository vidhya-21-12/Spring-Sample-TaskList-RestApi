package com.example.SpringTask.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PersonalDetails")
public class PersonalDetails {

    @Id
    @GeneratedValue(generator = "PersonalId",strategy = GenerationType.AUTO)
    private Long PersonalId;

    @Column(name = "martialStatus")
    private String martialStatus;

    @Column(name = "BloodGroup")
    private String bloodgroup;

    @Column(name = "Address")
    private String address;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    @JsonBackReference
    private Employee userPatient;



}

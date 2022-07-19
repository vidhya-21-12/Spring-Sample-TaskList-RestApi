package com.example.SpringTask.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)

public class EmployeeDto {

    private Long id;
    private String empName;
    private String empDateOfBirth;
    private String email;
    private String password;
    private String phoneNumber;
    private String DateOfJoining;
    private String jobTitle;
    private String Description;
    private PersonalDto personalDto;
}

package com.example.SpringTask.Dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class TaskListDto {


    private String topic;
    private String assignedOn;
    private String learnedOn;
    private String praticedOn;
    private String status;
    private String level;
    private String Clarifications;
    private String tutorialLink;
    private String repositoryLink;

}

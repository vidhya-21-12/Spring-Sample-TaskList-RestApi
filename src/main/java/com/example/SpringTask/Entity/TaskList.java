package com.example.SpringTask.Entity;


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
@Table(name = "TaskList")
public class TaskList {

    @Id
    @GeneratedValue(generator = "id",strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "topic")
    private String topic;

    @Column(name = "assignedOn")
    private String assignedOn;

    @Column(name = "learnedOn")
    private String learnedOn;

    @Column(name = "praticedOn")
    private String praticedOn;

    @Column(name = "status")
    private String status;

    @Column(name = "level")
    private String level;

    @Column(name = "Clarifications")
    private String Clarifications;

    @Column(name = "tutorialLink")
    private String tutorialLink;

    @Column(name = "repositoryLink")
    private String repositoryLink;
}


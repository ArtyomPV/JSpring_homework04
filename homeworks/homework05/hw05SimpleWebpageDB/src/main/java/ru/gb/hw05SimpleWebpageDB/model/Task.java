package ru.gb.hw05SimpleWebpageDB.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String text;
    @Column(name="status")
    @Enumerated(EnumType.ORDINAL)
    private TaskStatus taskStatus;
    @Column(name="creation")
    @Temporal(TemporalType.TIMESTAMP )
    private LocalDateTime timeCreation;

    public Task(){

    }
    public Task(String title, String text){
        this.title=title;
        this.text = text;
        this.taskStatus = TaskStatus.NOT_STARTED;
        this.timeCreation = LocalDateTime.now();
    }


    public enum TaskStatus{
        NOT_STARTED,
        IN_PROGRESS,
        COMPLETED;
    }
}

package ru.gb.hw05SimpleWebpageDB.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Status status;

    @Column(name = "publication_date")
    private LocalDate creationDate;

    public Task(){

    }

    public Task(String title){
        this.title = title;
        this.creationDate = LocalDate.now();
        this.status = Status.NEW;
    }


}

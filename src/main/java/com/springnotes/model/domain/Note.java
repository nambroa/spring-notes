package com.springnotes.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private String description;

    public Note(String title, String description){
        this.title = title;
        this.description = description;
    }
}
package com.example.valerienails.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Setter;

@Entity
public class VisitorCount {

    @Id
    private int id = 1;

    @Setter
    private int count;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

}
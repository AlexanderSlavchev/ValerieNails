package com.example.valerienails.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class VisitorCount {

    @Id
    private int id = 1;

    private LocalDateTime date;

    private int count;


}
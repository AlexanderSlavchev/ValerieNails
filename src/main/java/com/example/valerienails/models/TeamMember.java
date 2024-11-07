package com.example.valerienails.models;

import com.example.valerienails.models.enums.PositionType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class TeamMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private PositionType position;
    private String description;
    private String image;

    @OneToMany(mappedBy = "teamMember", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Certificate> certificates;



}

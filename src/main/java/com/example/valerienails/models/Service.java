package com.example.valerienails.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;
    private double price;
    private int duration;
    private String image;
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "team_member_id")
    private TeamMemberDetails teamMemberDetails;



}


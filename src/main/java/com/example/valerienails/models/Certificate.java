package com.example.valerienails.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String imageUrl;

    @ManyToOne()
    @JoinColumn(name = "team_member_id")
    private TeamMember teamMember;
}

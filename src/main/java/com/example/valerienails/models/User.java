package com.example.valerienails.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
    private boolean isBlocked;
    private boolean isBanned;
    private String profilePhoto;

    @OneToMany(mappedBy = "user")
    private List<Image> images;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}

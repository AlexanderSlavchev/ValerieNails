package com.example.valerienails.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    int id;

    String username;
    String password;
    String email;
    String phone;
    String firstName;
    String lastName;
    boolean isBlocked;
    boolean isBanned;
    String profilePhoto;

    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role_id;

}

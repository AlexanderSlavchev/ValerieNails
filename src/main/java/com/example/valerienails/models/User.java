package com.example.valerienails.models;

import com.example.valerienails.models.enums.RoleType;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_member_details_id")
    private TeamMemberDetails teamMemberDetails;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}

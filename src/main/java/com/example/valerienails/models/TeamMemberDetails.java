package com.example.valerienails.models;

import com.example.valerienails.models.enums.PositionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class TeamMemberDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private PositionType position;
    private String description;

    @OneToMany(mappedBy = "teamMemberDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Service> services;

    @OneToMany(mappedBy = "teamMemberDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Certificate> certificates;


    public void addService(Service service) {
        if (services == null) {
            services = List.of();
        } if (services.contains(service)) {
            return;
        }
        services.add(service);
        service.setTeamMemberDetails(this);
    }

}

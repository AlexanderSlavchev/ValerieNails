package com.example.valerienails.repositories;

import com.example.valerienails.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Integer> {

        Role findById(int id);

        @Query("SELECT r FROM Role r WHERE r.name = ?1")
        Role findByName(String name);
}

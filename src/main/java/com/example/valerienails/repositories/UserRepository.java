package com.example.valerienails.repositories;

import com.example.valerienails.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

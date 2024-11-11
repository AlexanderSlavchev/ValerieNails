package com.example.valerienails.repositories;

import com.example.valerienails.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRepository extends JpaRepository<Service, Integer> {
}

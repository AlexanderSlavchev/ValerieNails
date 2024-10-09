package com.example.valerienails.repositories;

import com.example.valerienails.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {

    Image findById(int id);
    Image findByPath(String path);
}

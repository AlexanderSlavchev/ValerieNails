package com.example.valerienails.repositories;
import com.example.valerienails.models.VisitorCount;
import org.springframework.data.repository.CrudRepository;

public interface VisitorRepository extends CrudRepository<VisitorCount, Integer> {
}
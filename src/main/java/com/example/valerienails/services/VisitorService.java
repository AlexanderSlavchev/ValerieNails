package com.example.valerienails.services;
import com.example.valerienails.models.VisitorCount;
import com.example.valerienails.repositories.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;

    private VisitorCount visitorCount;

    @PostConstruct
    public void init() {
        visitorCount = visitorRepository.findById(1).orElseGet(() -> {
            VisitorCount newCount = new VisitorCount();
            newCount.setCount(0);
            return visitorRepository.save(newCount);
        });
    }

    public void increment() {
        visitorCount.setCount(visitorCount.getCount() + 1);
        visitorRepository.save(visitorCount);
    }

    public int getCount() {
        return visitorCount.getCount();
    }
}
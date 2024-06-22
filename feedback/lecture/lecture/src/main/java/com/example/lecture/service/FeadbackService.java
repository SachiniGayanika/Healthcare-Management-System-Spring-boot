package com.example.lecture.service;

import com.example.lecture.data.Feadback;
import com.example.lecture.data.FeadbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeadbackService {

    @Autowired
    private FeadbackRepository feadbackRepository;

    public List<Feadback> getAllFeadback() {
        return feadbackRepository.findAll();
    }

    public Feadback createFeadback(Feadback feadback) {
        return feadbackRepository.save(feadback);
    }

    public Feadback updateFeadback(Feadback feadback) {
        return feadbackRepository.save(feadback);
    }
}

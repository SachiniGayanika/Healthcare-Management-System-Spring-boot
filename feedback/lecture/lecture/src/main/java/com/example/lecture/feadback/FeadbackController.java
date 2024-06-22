package com.example.lecture.feadback;

import com.example.lecture.data.Feadback;
import com.example.lecture.service.FeadbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feadbacks")  // Set a base mapping for the controller
public class FeadbackController {

    @Autowired
    private FeadbackService feadbackService;

    @GetMapping
    public List<Feadback> getAllFeadback() {
        return feadbackService.getAllFeadback();  // Use the service method
    }

    @PostMapping
    public Feadback createFeadback(@RequestBody Feadback feadback) {
        return feadbackService.createFeadback(feadback);  // Use the service method
    }

    @PutMapping
    public Feadback updateFeadback(@RequestBody Feadback feadback) {
        return feadbackService.updateFeadback(feadback);  // Use the service method
    }
}

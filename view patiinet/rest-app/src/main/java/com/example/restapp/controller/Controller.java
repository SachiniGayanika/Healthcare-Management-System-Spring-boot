package com.example.restapp.controller;

import com.example.restapp.data.ViewPatient;
import com.example.restapp.service.ViewPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {

    @Autowired
    private ViewPatientService viewPatientService;

    @GetMapping("/viewpatients")
    public List<ViewPatient> getAllViewPatients() {
        return viewPatientService.getAllViewPatients();
    }

    @GetMapping("/patients/{id}")
    public ViewPatient getViewPatientById(@PathVariable int id) {
        return viewPatientService.getViewPatientById(id);
    }
}

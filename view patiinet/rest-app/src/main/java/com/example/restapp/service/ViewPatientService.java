package com.example.restapp.service;

import com.example.restapp.data.ViewPatient;
import com.example.restapp.data.ViewPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ViewPatientService {

    @Autowired
    private ViewPatientRepository viewPatientRepository;

    public List<ViewPatient> getAllViewPatients() {
        return viewPatientRepository.findAll();
    }

    public ViewPatient getViewPatientById(int id) {
        return viewPatientRepository.getById(id);
    }
}

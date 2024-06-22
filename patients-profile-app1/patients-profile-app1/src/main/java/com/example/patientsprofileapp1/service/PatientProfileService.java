package com.example.patientsprofileapp1.service;

import com.example.patientsprofileapp1.data.PatientProfile;
import com.example.patientsprofileapp1.data.PatientProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientProfileService {

    @Autowired
    private PatientProfileRepository patientProfileRepository;

    public List<PatientProfile> getAllPatientProfile() {
        return patientProfileRepository.findAll();
    }

    public List<PatientProfile>getPatientProfileById(int id){
        return patientProfileRepository.getPatientProfileById(id);
    }

}

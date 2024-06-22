package com.example.patientsprofileapp1.controller;

import com.example.patientsprofileapp1.data.PatientProfile;
import com.example.patientsprofileapp1.service.PatientProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientProfileController {

    @Autowired
    private PatientProfileService patientProfileService;

    @GetMapping(path = "/PatientProfiles")
    public List<PatientProfile> getAllPatientProfile() {
        return patientProfileService. getAllPatientProfile();
    }

    @GetMapping(path ="/PatientProfiles",params ="id")
    public List<PatientProfile>getPatientProfileById(@RequestParam int id){
        return patientProfileService.getPatientProfileById(id) ;

    }



}

package com.example.restapp2.controller;

import com.example.restapp2.data.Patient;
import com.example.restapp2.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping(path = "/patients")
    public List<Patient> getAllPatient() {
        return patientService.getAllPatient();
    }

    @GetMapping(path="/patients/{id}")
    public Patient getPatientById(@PathVariable int id){
        return patientService.getPatientById (id);
    }

    @PutMapping(path="/patients")
    public Patient updatePatient(@RequestBody Patient patient){
        return  patientService.updatePatient(patient);
    }

    @DeleteMapping(path="/patients/{id}")
    public String deletePatient(@PathVariable int id){
        return patientService.deletePatient(id);
    }


    @GetMapping(path ="/Patients",params ="name")
    public List<Patient> getPatientByName(@RequestParam String name){
        return patientService. getPatientByName(name) ;

    }



}

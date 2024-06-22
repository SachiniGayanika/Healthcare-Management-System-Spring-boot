package com.example.restapp2.service;

import com.example.restapp2.data.Patient;
import com.example.restapp2.data.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient>getAllPatient() {
        return patientRepository.findAll();
    }
    public Patient getPatientById(int id){

        Optional<Patient> Patient = patientRepository.findById(id);
        if(Patient.isPresent()){
            return  Patient.get();
        }
        return null;
    }

    public Patient updatePatient(Patient patient){

        return patientRepository.save(patient);
    }

    public String deletePatient(int id){
        patientRepository.deleteById(id);
        return "deleted";
    }

    public List<Patient>getPatientByName(String name){
        return patientRepository. getPatientByName(name);
    }



}

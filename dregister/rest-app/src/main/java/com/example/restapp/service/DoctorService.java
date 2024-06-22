package com.example.restapp.service;

import com.example.restapp.data.Doctor;
import com.example.restapp.data.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctor(){
        return doctorRepository.findAll();
    }

    public Doctor createDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }
}

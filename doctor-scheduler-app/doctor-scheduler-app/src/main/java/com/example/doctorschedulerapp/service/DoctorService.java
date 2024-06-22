package com.example.doctorschedulerapp.service;

import com.example.doctorschedulerapp.data.Doctor;
import com.example.doctorschedulerapp.data.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById (int patient_id){

        Optional<Doctor> Doctor = doctorRepository.findById(patient_id);
        if(Doctor.isPresent()){
            return  Doctor.get();
        }
        return null;
    }

    public Doctor createDoctor(Doctor doctor){
        return  doctorRepository.save(doctor);
    }

    public Doctor updateDoctor(Doctor doctor){

        return doctorRepository.save(doctor);
    }

    public String deleteDoctor(int patient_id){
        doctorRepository.deleteById(patient_id);
        return "deleted";
    }






}

package com.example.doctorschedulerapp.controller;

import com.example.doctorschedulerapp.data.Doctor;
import com.example.doctorschedulerapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping(path = "/doctors")
    public List<Doctor> getAllDoctor() {
        return doctorService.getAllDoctor();
    }

    @PostMapping(path="/doctors")
    public Doctor createDoctor(@RequestBody Doctor doctor){

        return doctorService.createDoctor(doctor);
    }

    @GetMapping(path="/doctors/{patient_id}")
    public Doctor getDoctorById(@PathVariable int patient_id){
        return doctorService.getDoctorById (patient_id);
    }

    @PutMapping(path="/doctors")
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return doctorService.updateDoctor(doctor);
    }

    @DeleteMapping(path="/doctors/{patient_id}")
    public String deleteDoctor(@PathVariable int patient_id) {
        return doctorService.deleteDoctor(patient_id);
    }



}

package com.example.restapp.controller;

import com.example.restapp.data.Doctor;
import com.example.restapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Correct import statement for List

@RestController
/*@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/doctor")*/

public class DocRegisterController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping(path = "/doctors")
    public List<Doctor> getAllDoctor() {
        return doctorService.getAllDoctor();
    }

    @PostMapping(path = "/doctors")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }
}

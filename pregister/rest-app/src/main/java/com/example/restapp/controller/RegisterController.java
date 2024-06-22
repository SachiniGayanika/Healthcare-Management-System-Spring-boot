package com.example.restapp.controller;

import com.example.restapp.data.Register;
import com.example.restapp.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/patients")


public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping(path = "/patients")
    public List<Register>getAllRegister(){
        return registerService.getAllRegister();
    }
    @PostMapping(path = "/patients")
    public Register createRegister(@RequestBody Register register){
        return registerService.createRegister(register);
    }


}

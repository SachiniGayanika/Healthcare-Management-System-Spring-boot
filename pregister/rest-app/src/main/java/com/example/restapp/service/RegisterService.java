package com.example.restapp.service;

import com.example.restapp.data.Register;
import com.example.restapp.data.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public List<Register> getAllRegister(){
        return registerRepository.findAll();
    }

    public Register createRegister(Register register){
        return registerRepository.save(register);
    }
}

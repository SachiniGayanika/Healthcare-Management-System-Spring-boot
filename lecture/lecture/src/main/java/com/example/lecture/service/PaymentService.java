package com.example.lecture.service;

import com.example.lecture.data.PaymentRepository;
import com.example.lecture.data.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayment()
    {return paymentRepository.findAll();}


    public Payment createPayment (Payment payment){
        return paymentRepository.save(payment);}




}

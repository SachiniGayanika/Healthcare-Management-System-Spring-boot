package com.example.lecture.payment;

import com.example.lecture.data.Payment;
import com.example.lecture.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping(path = "/payments")
    public List<Payment> getAllPayment(){
        return paymentService.getAllPayment();}


    @PostMapping(path = "/payments")
    public Payment createPayment(@RequestBody Payment payment){
        return paymentService.createPayment(payment);
    }




}

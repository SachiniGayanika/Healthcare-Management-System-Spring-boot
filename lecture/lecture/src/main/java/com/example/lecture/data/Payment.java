package com.example.lecture.data;

import javax.persistence.*;

@Entity
@Table(name="payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int card_number;

    @Column(name ="expiry_date")
    private String expiry_date;

    @Column(name = "cvv")
    private Double cvv;

    @Column(name="amount")
    private String amount;

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public Double getCvv() {
        return cvv;
    }

    public void setCvv(Double cvv) {
        this.cvv = cvv;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }






}



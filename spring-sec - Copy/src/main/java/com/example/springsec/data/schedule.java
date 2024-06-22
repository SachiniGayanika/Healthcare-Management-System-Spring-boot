//data package eke Lecture class eka

package com.example.springsec.data;

import javax.persistence.*;

@Entity
@Table (name = "scheduler")

public class schedule{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sche_id")
    private int sche_id;


    @Column(name = "name")
    private String name;

    @Column(name = "mob")
    private int mob;

    @Column(name = "doctor")
    private String doctor;


    @Column(name = "service")
    private String service;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;


    public int getId() {
        return sche_id;
    }

    public void setId(int id) {
        this.sche_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}

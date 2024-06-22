package com.example.restapp2.data;

import javax.persistence.*;

@Entity
@Table(name = "patients_tbl")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    private  String date_of_birth;

    @Column(name = "age")
    private  int age;

    @Column(name = "contact_number")
    private String contact_number;

    @Column(name = "email")
    private String email;

    @Column(name = "chronic_diseases")
    private String chronic_diseases;

    @Column(name = "other_diseases")
    private String other_diseases;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChronic_diseases() {
        return chronic_diseases;
    }

    public void setChronic_diseases(String chronic_diseases) {
        this.chronic_diseases = chronic_diseases;
    }

    public String getOther_diseases() {
        return other_diseases;
    }

    public void setOther_diseases(String other_diseases) {
        this.other_diseases = other_diseases;
    }
}
